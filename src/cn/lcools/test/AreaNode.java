package cn.lcools.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2020 - liushuai3
 *
 * @ClassName: AreaNode
 * @Description: 存储地域的树结构
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2020/6/2 21:02
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/6/2     liushuai3           v1.0.0               修改原因
 */
public class AreaNode {
    private Map<String, AreaNode> next;
    private Long value;

    public AreaNode(){}

    public AreaNode(Map<String, AreaNode> next, Long value) {
        this.next = next;
        this.value = value;
    }

    /**
     *
     * 向树结构添加地域数据信息
     * */
    public AreaNode add(List<AreaResource> areas){
        AreaNode root = this;
        for(AreaResource areaResource : areas) {
            String area = areaResource.getArea();
            String splitString = areaResource.getSpliter();
            long count = areaResource.getCount();
            String[] areaSplits = area.split(splitString);
            AreaNode current = root;
            for (int i = 0; i < areaSplits.length; i++) {
                String areaKey = areaSplits[i];
                AreaNode next = current.next.get(areaKey);
                if(next==null){
                    if(i==areaSplits.length-1){
                        AreaNode node = new AreaNode(null,count);
                        current.next.put(areaKey, node);
                    }else {
                        current.next.put(areaKey, new AreaNode(new HashMap(30),null));
                    }
                }
                current = current.next.get(areaKey);
            }
        }
        return root;
    }

    /**
     *
     * 重写toString方法，遍历树结构拼接成json串。
     * */
    @Override
    public String toString() {
        if(next!=null){
            Iterator<Map.Entry<String, AreaNode>> i = next.entrySet().iterator();
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            for (;;) {
                Map.Entry<String, AreaNode> e = i.next();
                String key = e.getKey();
                AreaNode current = e.getValue();
                sb.append('\"').append(key).append('\"');
                sb.append(':');
                if(current.next==null){
                    sb.append("[\"").append(current.value).append("\"]");
                }
                sb.append(current);
                if (! i.hasNext()){
                    return sb.append('}').toString();
                }
                sb.append(',');
            }
        }else {
            return "";
        }
    }
}

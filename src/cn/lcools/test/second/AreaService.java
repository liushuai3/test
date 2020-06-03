package cn.lcools.test.second;

import java.util.List;
import java.util.TreeMap;

/**
 * 程序开发中经常会用到通过ip查询属于哪个城市，先提供ip字典表，请实现通过ip查询城市名
 * ip字典表格式(包含大部分的ip地址段)
 * 125.118. 207.0-125.118.248.13-浙江省杭州市
 * 47.153.128.0-47.153.191.255-北京市
 * 例如给出ip地址:47.153.128.1,返回北京市
 * 请完善下面的类
 * 1.内存越低越好，性能越高越好
 * 2.线程安全
 */

public class AreaService {
    //假设 areaList是ip字典一 行一行读取后的结果
    public List<String> ipAreaList;

    public AreaService() {
    }

    public AreaService(List<String> ipAreaList) {
        this.ipAreaList = ipAreaList;
    }

    public String getAreaByIp(String ip) {
        TreeMap<IpNode, String> treeMap = new TreeMap<>();
        for (String ipString : ipAreaList) {
            String[] content = ipString.split("-");
            treeMap.put(new IpNode(content[0].split("\\."), content[1].split("\\.")), content[2]);
        }
        return treeMap.get(new IpNode(ip.split("\\."), ip.split("\\.")));
    }
}


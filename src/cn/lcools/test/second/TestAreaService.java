package cn.lcools.test.second;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright: Copyright (c) 2020 - Asiainfo
 *
 * @ClassName: TestAreaService
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2020/6/3 11:44
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/6/3     liushuai3           v1.0.0               修改原因
 */
public class TestAreaService {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("115.218.207.0-115.218.248.13-浙江省杭州市");
        arrayList.add("47.153.128.0-47.153.191.255-北京市");
        AreaService areaService = new AreaService(arrayList);
        String area = areaService.getAreaByIp("115.218.208.13");
        System.out.println(area);
    }
}

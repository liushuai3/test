package cn.lcools.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright: Copyright (c) 2020 - Asiainfo
 *
 * @ClassName: TestProvinceService
 * @Description: 测试
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2020/6/3 9:43
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/6/3     liushuai3           v1.0.0               修改原因
 */
public class TestProvinceService {

    public static void main(String[] args) {
        ProvinceService sv = new ProvinceServiceImpl();
        List<AreaResource> areas = new ArrayList<>();
        AreaResource areaResource = new AreaResource();
        areaResource.setArea("中国,四川,成都");
        areaResource.setSpliter(",");
        areaResource.setCount(10);
        AreaResource areaResource2 = new AreaResource();
        areaResource2.setArea("中国,浙江,杭州");
        areaResource2.setSpliter(",");
        areaResource2.setCount(25);
        AreaResource areaResource3 = new AreaResource();
        areaResource3.setArea("中国,浙江,义乌");
        areaResource3.setSpliter(",");
        areaResource3.setCount(22);
        areas.add(areaResource);
        areas.add(areaResource2);
        areas.add(areaResource3);
        String jsonString = sv.getFormattedJSONByResource(areas);
        System.out.println(jsonString);
    }
}
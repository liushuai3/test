package cn.lcools.test.third;

import java.util.HashMap;
import java.util.List;

/**
 * 现在需要把List<ProvinceResource> 进行字符串转换，供下游处理，需要做到同级的地域能合并
 * 比如area为中国,四川， 成都有10个门店，
 * 中国，浙江，杭州有25个门店中国，浙江,义乌有22个门店
 * spliter为逗号'
 * 最终转化成JSON的形式，并且同级的地域需要被合并，最终生成的JSON字符串如下所示
 * {"中国": {"四川":{"成都": ["10"]}, "浙江":{"义乌": ["22"], "杭州”: ["25"]}}}
 *
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2020/6/2 20:14
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/6/2     liushuai3           v1.0.0               修改原因
 */
public class ProvinceServiceImpl implements ProvinceService {
    @Override
    public String getFormattedJSONByResource(List<AreaResource> areas) {
        AreaNode root = new AreaNode(new HashMap(1), null);
        root.add(areas);
        return root.toString();
    }
}

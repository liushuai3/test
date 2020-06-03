package cn.lcools.test.third;

import java.util.List;

/**
 * 请完善下面的类
 * 1.内存越低越好，性能越高越好
 * 2.线程安全
 * 3.代码可读性好
 */
public interface ProvinceService {
    String getFormattedJSONByResource(List<AreaResource> areas);
}


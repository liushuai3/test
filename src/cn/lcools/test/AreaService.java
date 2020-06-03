package cn.lcools.test;

import java.util.List;

/**
 程序开发中经常会用到通过ip查询属于哪个城市，先提供ip字典表，请实现通过ip查询城市名
 ip字典表格式(包含大部分的ip地址段)
 125.118. 207.0-125.118.248.13-浙江省杭州市
 47.153.128.0-47.153.191.255-北京市
 例如给出ip地址:47.153.128.1,返回北京市
 请完善下面的类
 1.内存越低越好，性能越高越好
 2.线程安全
 */

public class AreaService {
    public List<String> ipAreaList;//假设 areaList是ip字典一 行一行读取后的结果
    public AreaService() {
    }
    public String getAreaByIp(String ip) {

        return "北京市";
    }
}


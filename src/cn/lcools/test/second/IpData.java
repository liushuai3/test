package cn.lcools.test.second;

/**
 * Copyright: Copyright (c) 2020 - liushuai3
 *
 * @ClassName: IpData
 * @Description: 存储区间IP的数据
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2020/6/3 11:38
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/6/3     liushuai3           v1.0.0               修改原因
 */
public class IpData implements Comparable<IpData> {
    long leftTransNum;
    long rightTransNum;

    /**
     * 实现比较接口方法
     */
    @Override
    public int compareTo(IpData o) {
        // 如果ip在区间内，认为是相等的。
        if (o.leftTransNum <= leftTransNum && rightTransNum <= o.rightTransNum) {
            return 0;
        }
        if (o.leftTransNum > rightTransNum) {
            return -1;
        }
        return 1;
    }

    public IpData(String[] leftIp, String[] rightIp) {
        this.leftTransNum = transNum(leftIp);
        this.rightTransNum = transNum(rightIp);
    }

    public IpData(String[] ipSplits) {
        long num = transNum(ipSplits);
        this.leftTransNum = num;
        this.rightTransNum = num;
    }

    /**
     * 用移位求和的操作把ip转换成32bit位
     */
    private long transNum(String[] ipSplits) {
        long sum = 0;
        sum += Integer.valueOf(ipSplits[0]);
        // 移位操作 11111111 00000000
        sum <<= 8;
        sum += Integer.valueOf(ipSplits[1]);
        // 移位操作 11111111 11111111 00000000
        sum <<= 8;
        sum += Integer.valueOf(ipSplits[2]);
        // 移位操作 11111111 11111111 11111111 00000000
        sum <<= 8;
        // 11111111 11111111 11111111 11111111
        sum += Integer.valueOf(ipSplits[3]);
        return sum;
    }
}

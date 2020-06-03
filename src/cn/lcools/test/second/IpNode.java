package cn.lcools.test.second;

/**
 * Copyright: Copyright (c) 2020 - Asiainfo
 *
 * @ClassName: IpNode
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: liushuai3
 * @date: 2020/6/3 11:38
 * *****
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2020/6/3     liushuai3           v1.0.0               修改原因
 */
public class IpNode implements Comparable<IpNode> {
    long sum1;
    long sum2;

    @Override
    public int compareTo(IpNode o) {
        if (o.sum1 <= sum1 && sum2 <= o.sum2) {
            return 0;
        }
        if (o.sum1 > sum2) {
            return 1;
        }
        return -1;
    }

    public IpNode(String[] sum1, String[] sum2) {
        this.sum1 = transNum(sum1);
        this.sum2 = transNum(sum2);
    }

    private long transNum(String[] nums) {
        long sum = 0;
        sum += Integer.valueOf(nums[0]);
        sum <<= 8;
        sum += Integer.valueOf(nums[1]);
        sum <<= 8;
        sum += Integer.valueOf(nums[2]);
        sum <<= 8;
        sum += Integer.valueOf(nums[3]);
        return sum;
    }
}

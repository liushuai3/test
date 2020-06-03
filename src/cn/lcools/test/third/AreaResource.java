package cn.lcools.test.third;

class AreaResource {
    /**
     * area表示的是地区全路径，最多可能有6级，用分隔符连接，分隔符是spliter,
     * <p>
     * 例如分隔符是逗号则area型如中国， 四川，成都
     * 中国，浙江,杭州中国， 浙江,义乌
     * <p>
     * count表示门店数
     */
    private String area;
    private String spliter;
    private long count;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSpliter() {
        return spliter;
    }

    public void setSpliter(String spliter) {
        this.spliter = spliter;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}

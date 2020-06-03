# 1.查询每家店销售额最高的商品情况
select a.shop, b.item, a.volume
    from (select shop, max(volume) volume from sales group by shop) a
    left join sales b on b.volume = a.volume and b.shop = a.shop;

# 2.查询有产品平均销售>200商品的店的平均销售额
select item, avg(volume) avgVolume from sales group by item having avgVolume>200;
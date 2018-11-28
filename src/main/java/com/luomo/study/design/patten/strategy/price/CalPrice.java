package com.luomo.study.design.patten.strategy.price;

/**
 * @author LiuMei
 * @date 2018-11-28.
 */
public interface CalPrice {

    /**
     * 根据原价返回最终价格
     *
     * @param originalPrice
     * @return
     */
    Double calPrice(Double originalPrice);

}

/**
 * 设置普通的在0-1000生效
 */
@TotalValidRegion(max = 1000)
class Common implements CalPrice {

    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;
    }

}

@TotalValidRegion(min = 1000, max = 2000)
class Vip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }

}

@TotalValidRegion(min = 2000, max = 3000)
class SuperVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }

}

@TotalValidRegion(min = 3000)
class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }

}
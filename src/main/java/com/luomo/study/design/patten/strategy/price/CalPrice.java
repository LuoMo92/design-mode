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
@TotalValidRegion(@ValidRegion(max = 1000,order = 99))
class Common implements CalPrice {

    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;
    }

}

@TotalValidRegion(@ValidRegion(min = 1000, max = 2000,order = 99))
class Vip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }

}

@TotalValidRegion(@ValidRegion(min = 2000, max = 3000,order = 99))
class SuperVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }

}

@TotalValidRegion(@ValidRegion(min = 3000,max = 4000,order = 99))
class GoldVip implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }
}

@OnceValidRegion(@ValidRegion(min=1000,max=2000,order=40))
class OneTDTwoH implements CalPrice{

    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice - 200;
    }

}

@OnceValidRegion(@ValidRegion(min=2000,order=40))
class TwotDFourH implements CalPrice{

    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice - 400;
    }

}
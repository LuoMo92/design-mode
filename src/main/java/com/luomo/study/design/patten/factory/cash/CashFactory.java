package com.luomo.study.design.patten.factory.cash;

/**
 * @author LiuMei
 * @date 2018-05-29.
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
        }
        return cashSuper;
    }

}

package com.luomo.study.design.patten.flyweight.hero;

import java.util.HashMap;
import java.util.Map;

/**
 * 提供共享功能，单例
 *
 * @author LiuMei
 * @date 2018-11-29.
 */
public class HeroManager {

    private static HeroManager heroManager = new HeroManager();

    private Map<String, AbstractHero> heroMap;

    private HeroManager(){
        heroMap = new HashMap<>();
    }

    public static HeroManager getInstance(){
        return heroManager;
    }

    /**
     * 该方法提供共享功能
     * @param name
     * @return
     */
    public AbstractHero getHero(String name){
        AbstractHero hero = heroMap.get(name);
        if (hero == null) {
            if (name.equals("恶魔巫师")) {
                hero = new Lion();
            }else if (name.equals("影魔")) {
                hero = new SF();
            }
            heroMap.put(name, hero);
        }
        return hero;
    }

}

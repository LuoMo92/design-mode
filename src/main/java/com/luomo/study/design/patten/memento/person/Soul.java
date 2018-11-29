package com.luomo.study.design.patten.memento.person;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class Soul {

    private Map<Person, Memory> memoryMap = new HashMap<>();

    /**
     * 抽离或者说搜集一个人的记忆
     * @param person
     */
    public void pullAwayMemory(Person person){
        memoryMap.put(person, person.getMemory());
    }

    /**
     * 强行将一个人的记忆固定在某一刻
     * @param person
     */
    public void forceFixMemory(Person person){
        if (memoryMap.containsKey(person)) {
            person.setMemory(memoryMap.get(person));
        }
    }
}

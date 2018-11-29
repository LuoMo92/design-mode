package com.luomo.study.design.patten.memento.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class Person {

    private String name;

    /**
     * 故事列表
     */
    private List<String> storyList;

    public Person(String name){
        this.name = name;
        storyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 故事列表不能修改
     * @return
     */
    public List<String> getStoryList() {
        return Collections.unmodifiableList(storyList);
    }

    /**
     * 可以添加，但不可以删除
     * @param history
     */
    public void addStory(String history) {
        this.storyList.add(history);
    }

    /**
     * 获取记忆
     * @return
     */
    public Memory getMemory(){
        Memory memory = new Memory();
        memory.setStoryList(new ArrayList<>(storyList));
        return memory;
    }

    /**
     * 恢复记忆
     * @param memory
     */
    public void setMemory(Memory memory){
        storyList = memory.getStoryList();
    }

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer(name + "的记忆：\n");
        for(String memory : storyList){
            stringBuffer.append(memory).append("\n");
        }
        return stringBuffer.toString();
    }

}

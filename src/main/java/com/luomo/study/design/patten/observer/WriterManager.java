package com.luomo.study.design.patten.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * 管理器，保持一份独有的作者列表
 * @author LiuMei
 * @date 2018-11-26.
 */
public class WriterManager {

    private Map<String, Writer> writerMap = new HashMap<>();

    /**
     * 添加作者
     * @param writer
     */
    public void add(Writer writer){
        writerMap.put(writer.getName(), writer);
    }

    /**
     * 根据作者姓名获取作者
     * @param name
     * @return
     */
    public Writer getWriter(String name){
        return writerMap.get(name);
    }

    /**
     * 单例
     */
    private WriterManager(){}

    public static WriterManager getInstance(){
        return WriterManagerInstance.instance;
    }
    private static class WriterManagerInstance{
        private static WriterManager instance = new WriterManager();
    }

}

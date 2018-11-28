package com.luomo.study.design.patten.strategy.price;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author LiuMei
 * @date 2018-11-28.
 */
//我们定义一个嵌套注解
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidRegion {
    int max() default Integer.MAX_VALUE;
    int min() default Integer.MIN_VALUE;

    /**
     * 定义策略生效的顺序
     *
     * 默认0，为最优先
     * @return
     */
    int order() default 0;
}

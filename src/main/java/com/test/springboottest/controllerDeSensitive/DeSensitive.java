package com.test.springboottest.controllerDeSensitive;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.test.springboottest.Enum.DesensitizationTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 脱敏注解
 * DesensitizedUtil.DesensitizedType  为 hutools工具包 DesensitizedUtil.DesensitizedType 类的类型,
 * 使用hutools DesensitizedUtil.desensitized 进行脱敏
 * @author Andy
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@JacksonAnnotationsInside
//指定使用自定义的序列化器 (对添加@Sensitive 的实体 使用 SensitiveJsonSerializer.class  类进行序列化)
@JsonSerialize(using = DeSensitiveJsonSerializer.class)
public @interface DeSensitive {
    /**
     * 脱敏数据类型，在MY_RULE的时候，startInclude和endExclude生效
     */
    DesensitizationTypeEnum type() default DesensitizationTypeEnum.MY_RULE;

    /**
     * 脱敏开始位置（包含）
     */
    int startInclude() default 0;

    /**
     * 脱敏结束位置（不包含）
     */
    int endExclude() default 0;
}

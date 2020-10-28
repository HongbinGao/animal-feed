package com.animal.feed.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 验证框架工具类
 *
 * @author yunpeng.wang
 * @since 01 十一月 2018
 */
public class ValidUtils {
    /**
     * 验证器
     */
    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    /**
     * 验证
     *ç
     * @param object 目标对象
     * @param groups 验证分组
     * @param <T>    泛型
     * @return Result
     */
    public static <T> Result validate(T object, Class<?>... groups) {
        Set<ConstraintViolation<T>> result;
        if (Objects.isNull(groups) || groups.length == 0) {
            result = validator.validate(object);
        } else {
            result = validator.validate(object, groups);
        }
        String message = result
                .stream()
                .map(ob -> new StringBuilder(ob.getMessage()))
                .collect(Collectors.joining(","));
        return Result.builder()
                     .flag(StringUtils.isBlank(message))
                     .message(message)
                     .build();
    }

    /**
     * 验证
     *
     * @param object 对象
     * @param <T>    泛型
     * @return
     */
    public static <T> Result validate(T object) {
        return validate(object, null);
    }

    /**
     * 验证结果
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Result {
        /**
         * 标示
         */
        private Boolean flag;
        /**
         * 失败消息
         */
        private String message;
    }
}

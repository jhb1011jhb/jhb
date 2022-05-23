package com.bobo.jhb.utils;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

public class BeanConvertUtils {
    private static final Logger log = LoggerFactory.getLogger(BeanConvertUtils.class);

    public BeanConvertUtils() {
    }

    public static <T> T convert(Object source, Class<T> targetClass) {
        try {
            if (source == null) {
                return targetClass.newInstance();
            } else {
                T target = targetClass.newInstance();
                BeanUtils.copyProperties(source, target);
                return target;
            }
        } catch (Exception var3) {
            log.error(ExceptionUtils.getStackTrace(var3));
            return null;
        }
    }

    public static void convert(Object source, Object target) {
        BeanUtils.copyProperties(source, target);
    }
}
package com.example.springbootapitest.interceptor;

import java.lang.annotation.*;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/18 09:36
 * @Describe todo
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnyPrint {
}

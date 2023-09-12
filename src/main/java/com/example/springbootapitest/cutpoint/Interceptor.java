package com.example.springbootapitest.cutpoint;


import com.sun.jdi.InvocationException;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author zhangdx
 * @CreateDate 2023/8/1 09:33
 * @Describe todo
 */
public interface Interceptor {
    boolean before();

    boolean after();

    Object around(Invocation invocation) throws InvocationException, IllegalAccessException, InvocationTargetException;

    void afterReturning();

    void afterThrowing();

    boolean userAround();
}

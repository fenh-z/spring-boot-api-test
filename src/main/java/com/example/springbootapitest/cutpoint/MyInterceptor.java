package com.example.springbootapitest.cutpoint;

import com.sun.jdi.InvocationException;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author zhangdx
 * @CreateDate 2023/8/1 11:47
 * @Describe todo
 */
public class MyInterceptor implements Interceptor {
    @Override
    public boolean before() {
        System.out.println("before....");
        return true;
    }

    @Override
    public boolean after() {
        System.out.println("after....");
        return true;
    }

    @Override
    public Object around(Invocation invocation) throws InvocationException, IllegalAccessException, InvocationTargetException {
        System.out.println("around before .... ");
        Object object = invocation.proceed();
        return object;
    }

    @Override
    public void afterReturning() {
        System.out.println("afterReturning.....");
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    @Override
    public boolean userAround() {
        return false;
    }
}

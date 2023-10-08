package com.example.springbootapitest.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/18 09:33
 * @Describe todo
 */
public class AnyPrintInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(" any interceptor begin");
        System.out.println(" method interceptor " + invocation.getMethod().getName());
        invocation.proceed();
        System.out.println(" any interceptor end");
        return null;
    }
}

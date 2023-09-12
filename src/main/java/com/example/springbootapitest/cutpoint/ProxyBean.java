package com.example.springbootapitest.cutpoint;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/11 15:22
 * @Describe todo
 */
public class ProxyBean implements InvocationHandler {

    private Object target;
    private Interceptor interceptor;

    public static Object getProxyBean(Object target, Interceptor interceptor) {
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.interceptor = interceptor;
        proxyBean.target = target;
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces()
                , proxyBean);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object... args) {

        boolean exceptionFlag = false;
        Invocation invocation = new Invocation(args, method, target);
        Object obj = null;

        try {
            if (this.interceptor.before()) {
                obj = this.interceptor.around(invocation);
            } else {
                obj = method.invoke(target, args);
            }
        } catch (Exception e) {
            exceptionFlag = true;
        }
        this.interceptor.after();
        if (exceptionFlag) {
            this.interceptor.afterThrowing();
        } else {
            this.interceptor.afterReturning();
        }

        return obj;
    }
}

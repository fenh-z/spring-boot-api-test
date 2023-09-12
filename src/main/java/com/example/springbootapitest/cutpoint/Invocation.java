package com.example.springbootapitest.cutpoint;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author zhangdx
 * @CreateDate 2023/8/1 09:39
 * @Describe todo
 */
public class Invocation {
    private Object[] params;
    private Method method;
    private Object target;


    public Invocation(Object[] params, Method method, Object target) {
        this.params = params;
        this.method = method;
        this.target = target;
    }

    public Object proceed() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, params);
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}

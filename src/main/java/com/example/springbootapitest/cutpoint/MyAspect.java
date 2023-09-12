package com.example.springbootapitest.cutpoint;

import org.aspectj.lang.annotation.*;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/12 11:04
 * @Describe todo
 */
@Aspect
public class MyAspect {

    @Pointcut("execution(* cutpoint.HelloServiceImpl.sayHello(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before...");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after...");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

}

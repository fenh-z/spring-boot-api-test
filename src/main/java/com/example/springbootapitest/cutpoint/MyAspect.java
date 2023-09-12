package com.example.springbootapitest.cutpoint;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/12 11:04
 * @Describe todo
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.example.springbootapitest.cutpoint.HelloServiceImpl.sayHello(..))")
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

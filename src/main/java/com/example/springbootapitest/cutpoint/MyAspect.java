package com.example.springbootapitest.cutpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
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

    @Pointcut(value = "@annotation(AspectAOP)")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before...");
    }

    @Before("pointCut() && args(arg)")
    public void beforeParam(JoinPoint joinPoint, String arg) {
        Object[] args = joinPoint.getArgs();
        System.out.println("before param .....");
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

//    @Around("pointCut()")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("around before ...");
//        joinPoint.proceed();
//        System.out.println("around after ...");
//    }

}

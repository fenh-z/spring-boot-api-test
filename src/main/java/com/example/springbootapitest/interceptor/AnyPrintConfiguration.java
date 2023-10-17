package com.example.springbootapitest.interceptor;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/18 09:47
 * @Describe todo
 */
@Configurable
public class AnyPrintConfiguration {

    @Bean
    public DefaultPointcutAdvisor anyPrintPointcutAdvisor() {
        AnyPrintInterceptor anyPrintInterceptor = new AnyPrintInterceptor();
        DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();


        pointcut.setExpression("@annotation(com.example.springbootapitest.interceptor.AnyPrint)");
        defaultPointcutAdvisor.setPointcut(pointcut);
        defaultPointcutAdvisor.setAdvice(anyPrintInterceptor);
        return defaultPointcutAdvisor;
    }
}

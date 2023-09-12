package com.example.springbootapitest.cutpoint;

/**
 * @Author zhangdx
 * @CreateDate 2023/8/1 09:30
 * @Describe todo
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new RuntimeException("parameter name is null");
        }
        //b2 注释
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("YY");


    }
}

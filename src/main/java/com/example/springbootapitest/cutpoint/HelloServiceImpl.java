package com.example.springbootapitest.cutpoint;

import com.example.springbootapitest.interceptor.AnyPrint;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author zhangdx
 * @CreateDate 2023/8/1 09:30
 * @Describe todo
 */
@Controller
@RequestMapping("/hello")
public class HelloServiceImpl implements HelloService {

    @Override
    @RequestMapping("/say")
    @ResponseBody
    @AnyPrint
    public String sayHello(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new RuntimeException("parameter name is null");
        }
        return "hello " + name;
    }

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("YY");

        List<Map<String, Object>> a = new ArrayList<>();
        a.isEmpty();

    }
}

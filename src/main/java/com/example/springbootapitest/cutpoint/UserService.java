package com.example.springbootapitest.cutpoint;

import com.example.springbootapitest.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/12 17:43
 * @Describe todo
 */
@Component
public class UserService {
    public void printUser(User user) {
        if (user == null) {
            throw new RuntimeException("check user is null");
        }
        System.out.println("id = " + user.getId());
        System.out.println("name = " + user.getUser_name());
        System.out.println("note = " + user.getNote());
    }
}

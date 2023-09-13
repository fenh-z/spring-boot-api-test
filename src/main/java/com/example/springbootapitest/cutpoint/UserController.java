package com.example.springbootapitest.cutpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/12 17:45
 * @Describe todo
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @AspectAOP
    @RequestMapping("/print")
    @ResponseBody
    public User printUser(int id, String name, String note) {
        User user = new User().setId(id).setName(name).setNote(note);
        userService.printUser(user);
        return user;
    }
}

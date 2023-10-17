package com.example.springbootapitest.cutpoint;

import com.example.springbootapitest.dao.UserDao;
import com.example.springbootapitest.pojo.User;
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
    @Autowired
    private UserDao userDao;

    @AspectAOP
    @RequestMapping("/print")
    @ResponseBody
    public User printUser(Long id, String name, String note) {
        User user = new User();
        user.setId(id);
        user.setUser_name(name);


        user.setNote(note);
        userService.printUser(user);
        return user;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Long id) {
        return userDao.qryUserById(id);
    }


}

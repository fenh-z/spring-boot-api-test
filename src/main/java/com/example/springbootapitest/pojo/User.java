package com.example.springbootapitest.pojo;

import org.apache.ibatis.type.Alias;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/13 15:29
 * @Describe todo
 */
@Alias(value = "user")
public class User {
    private Long id;
    private String user_name;
    private Long sex;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}

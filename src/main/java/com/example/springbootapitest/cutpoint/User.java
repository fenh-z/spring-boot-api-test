package com.example.springbootapitest.cutpoint;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/12 17:43
 * @Describe todo
 */
public class User {
    private int id;
    private String name;
    private String note;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getNote() {
        return note;
    }

    public User setNote(String note) {
        this.note = note;
        return this;
    }
}

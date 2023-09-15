package com.example.springbootapitest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/13 15:29
 * @Describe todo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Alias(value = "user")
public class User {
    private Long id;
    private String user_name;
    private Long sex;
    private String note;

}

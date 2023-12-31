package com.example.springbootapitest.dao;

import com.example.springbootapitest.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/13 15:33
 * @Describe todo
 */
@Mapper
@Repository
public interface UserDao {
    User qryUserById(Long id);
}

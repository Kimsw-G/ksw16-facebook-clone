package com.example.fbt.dao;

import com.example.fbt.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDAO {
    int insertUser(UserEntity param);

}

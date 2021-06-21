package com.example.fbt.service;

import com.example.fbt.dao.UserDAO;
import com.example.fbt.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public int join(UserEntity param){

        param.setPw(BCrypt.hashpw(param.getPw(), BCrypt.gensalt()));

        return userDAO.insertUser(param);
    }
}

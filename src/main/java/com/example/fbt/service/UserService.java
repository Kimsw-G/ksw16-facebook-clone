package com.example.fbt.service;

import com.example.fbt.dao.UserDAO;
import com.example.fbt.model.UserEntity;
import com.example.fbt.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;

@Service
public class UserService {

    private static String SUBJECT = "@@페이지에 회원가입을 축하합니다";

    @Autowired
    UserDAO userDAO;
    @Autowired
    EmailService emailService;

    public int join(UserEntity param){
        param.setPw(BCrypt.hashpw(param.getPw(), BCrypt.gensalt()));
        param.setAuthcd(UserUtil.randomCode(5));

        int result = userDAO.insertUser(param);

        if(result==1){
            emailService.sendMimeMessage(param.getEmail(),SUBJECT,"");
        }

        return 0;
    }
}

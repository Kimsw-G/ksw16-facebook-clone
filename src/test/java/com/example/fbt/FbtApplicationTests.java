package com.example.fbt;

import com.example.fbt.service.EmailService;
import com.example.fbt.util.UserUtil;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FbtApplicationTests {

    @Autowired
    EmailService service;

    @Test
    void sendSimple() {
        String text = "<a href='localhost:8080'>hello</a>";
        service.sendSimpleMessage("kimsw3445@naver.com","hello",text);
    }

    @Test
    void sendMime() {
        String text = "<a href='localhost:8080'>hello</a>";
        service.sendMimeMessage("kimsw3445@naver.com","hello",text);
    }

    @Test
    void getRandomCode(){
        UserUtil userUtil = new UserUtil();
        System.out.println(userUtil.randomCode(5));;
    }

    @Test
    void testRandom(){
        System.out.println(RandomStringUtils.random(5,true,false));
    }
}

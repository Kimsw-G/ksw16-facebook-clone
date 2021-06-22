package com.example.fbt.util;

import org.apache.commons.lang3.RandomStringUtils;


public class UserUtil {

    public static String randomCode(int len){
        return RandomStringUtils.randomAlphanumeric(len);
    }
}

package com.example.demo.utils.md5util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Tony on 2017/10/11.
 * com.example.demo.utils.md5util.springbootmybatis
 */
public class Md5Util {

    public static String getMd5(String password){
        try {
            password = "@!*#" + password;
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(password.getBytes());
            password = new BigInteger(1 , md5.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return password;
    }

}

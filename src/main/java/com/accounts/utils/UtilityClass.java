package com.accounts.utils;


import java.math.BigInteger;
import java.security.MessageDigest;



public class UtilityClass {    
	
    public static String getRelPathToFile(String fullPath) {
        return fullPath.split(Constants.SOURCE_DIRECTORY)[1];
    }

    public static String getMD5(String input){
        String md5 = null;

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md5 = new BigInteger(1, md.digest(input.getBytes())).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return md5;
    }
}

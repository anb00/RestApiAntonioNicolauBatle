package com.iesemilidarder.anicolau;

public class NewHelper {


    private NewHelper() {

    }

    public static void consolePrint(String message) {
        System.out.println(message);
    }


    public static void errRate(Exception r) {
        consolePrint("ERR_RATE_NOT_RESOLVED:" + r);
    }


}
package com.migr.common.util;

public class StringUtils {
    public static boolean isBlank(String startTime) {
        if(startTime==null||startTime==""){
            return true;
        }
        return false;
    }

    public static boolean isNotBlank(String endTime) {
        if(isBlank(endTime)) {
            return false;
        }
           return true;
    }
}

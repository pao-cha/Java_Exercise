package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mingyu, guo
 * @date 2024-08-01 13:21
 */

public class DateTest {

    private static final String DATE_PATTERN = "^(19|20)\\d{2}-\\d{2}-\\d{2}$";

    public static void main(String[] args) {
        System.out.println(dateFormatConvert("023-08-01"));
    }
    public static String dateFormatConvert(String rateDate) {
        Pattern pattern = Pattern.compile(DATE_PATTERN);
        Matcher matcher = pattern.matcher(rateDate);
        if ( !matcher.matches()){
            return rateDate;
        } else{
            return rateDate.substring(0, 4) + "年" + rateDate.substring(5, 7) + "月" + rateDate.substring(8, 10) + "日";
        }
    }
}

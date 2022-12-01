package com.sparta.model;

public class DateFormatter {

    public static String dateFormat(String date)
    {
        String[] birth_date = date.split("/");
        return birth_date[2] + "-" + birth_date[1] + "-" + birth_date[0];
    }
}

package com.sparta.model;

import com.sparta.controller.Main;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DateFormatter {

    public static Logger logger = LogManager.getLogger(Main.class);

    public static String dateFormat(String date) {

        logger.log(Level.ERROR, "dateFormat() error!");
        logger.log(Level.WARN, "dateFormat() warn!");


        try {
            String[] birth_date = date.split("/");
            return birth_date[2] + "-" + birth_date[1] + "-" + birth_date[0];
        } catch(Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }
}

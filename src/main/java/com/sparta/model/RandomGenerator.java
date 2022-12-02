package com.sparta.model;

import com.sparta.controller.Main;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class RandomGenerator {

    public static Logger logger = LogManager.getLogger(Main.class);

    /*
    * This method generates a random number of employees from the "employee.csv"
    * */
    public String[] generateEmployees() {

        logger.log(Level.ERROR, "generateEmployees() error!");
        logger.log(Level.WARN, "generateEmployees() warn!");

        try {
            Random rand = new Random(); //Random generator from oracle
            String[] a = EmployeeFactory.getEmployees(rand.nextInt(1, 1000)); //using the employee factory to get the required employee data
            return a; //String array with the random number of employees
        } catch (Exception e) {
            System.out.println(e); //catch Exceptions potentially caused
            logger.error(e.getMessage(), e);
            return null;
        }

    }
}

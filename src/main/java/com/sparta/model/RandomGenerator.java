package com.sparta.model;

import java.util.Random;

public class RandomGenerator {
    /*
    * This method generates a random number of employees from the "employee.csv"
    * */
    public String[] generateEmployees() {
        try {
            Random rand = new Random(); //Random generator from oracle
            String[] a = EmployeeFactory.getEmployees(rand.nextInt(1, 1000)); //using the employee factory to get the required employee data
            return a; //String array with the random number of employees
        } catch (Exception e) {
            System.out.println(e); //catch Exceptions potentially caused
            return null;
        }

    }
}

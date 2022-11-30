package com.sparta.controller;

import com.sparta.model.Employee;
import com.sparta.model.RandomGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        RandomGenerator generateTheEmployees = new RandomGenerator(); //reference to the RandomGeneratorClass
        List<Employee> employees = new ArrayList();

        String[] randomEmployeesList = generateTheEmployees.generateEmployees(); //store the random number of employees between 1 - 1000 as a String array

        /*
        * just for printing purposes to check if we have the random employees in the string array*/
        int counter = 0;
        for (String b : randomEmployeesList)
        {
            System.out.println(randomEmployeesList[counter]);
            counter++;
        }

    }
}
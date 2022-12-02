package com.sparta.controller;

import com.sparta.model.*;
import org.w3c.dom.Node;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        RandomGenerator generateTheEmployees = new RandomGenerator(); //reference to the RandomGeneratorClass
        List<Employee> employees = new ArrayList();

        String[] randomEmployeesList = generateTheEmployees.generateEmployees(); //store the random number of employees between 1 - 1000 as a String array

        SplitEmployeeData temp = new SplitEmployeeData();
        employees = temp.employeeToList(randomEmployeesList);
        employees.add(new JobFactory().createEmployee("Developer", 1234556, "1998-10-10", "Emre", "Ceyhan", 'M', "2022-11-11"));
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.Node start = new BinaryTree.Node(employees.get(0));
        for (int i = 1; i < employees.size(); i++) {
            binaryTree.add(start, employees.get(i));
        }
        System.out.println(binaryTree.searchByLastName("Ceyhan", start));
        /*
        * just for printing purposes to check if we have the random employees in the string array*/
//        int counter = 0;
//        for (String b : randomEmployeesList)
//        {
//            System.out.println(randomEmployeesList[counter]);
//            counter++;
//        }

    }
}
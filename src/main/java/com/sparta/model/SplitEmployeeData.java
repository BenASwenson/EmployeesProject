package com.sparta.model;

import org.w3c.dom.Node;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SplitEmployeeData {


    /*
    method that takes the employee list as a String[].
    it then splits up the String[] so that we get each employees data as a string.
    It then splits the string to get each data as required in the brief
    and then passes it as a new employee reference inside the employeeList and returns it

    we can access each employee in the list with .get(the employee we look for) and use the getters from Employee class to access specific data for each employee
    System.out.println(employeeList.get(0).getFirst_name()); -> this for instance would print the first name of the first employee in the list
    *
    * */
    public ArrayList employeeToList(String[] strArray)
    {
        String[] split;
        String birth_date;
        String hire_date;
        ArrayList<Employee> employeeList = new ArrayList<>(); //list that will hold the employee objects list
        for(String splitUp : strArray) //loop through the string array and split up the data to pass as an employee object in employeeList
        {
            split = splitUp.split(","); //splits the employees by ,
            birth_date = DateFormatter.dateFormat(split[1]);
            hire_date = DateFormatter.dateFormat(split[5]);
            employeeList.add(new Employee(Integer.parseInt(split[0]), birth_date, split[2].replaceAll("[#@{}%$£!&*+.^:,]","").trim(), split[3].replaceAll("[#@{}%$£!&*+.^:,]","").trim(), split[4].charAt(0), hire_date)); //adds the created employee object in the list
        }

        return employeeList; // return the employee object list
    }

}

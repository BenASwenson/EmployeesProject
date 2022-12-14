package com.sparta.model;


import com.sparta.view.Job;

import java.util.Date;


public class Employee implements Comparable<Employee>, Job {



    // Employee fields
    private int emp_no;
    private String birth_date;
    private String first_name;
    private String last_name;
    private char gender;
    private String hire_date;

    //employee constructor to create an employee to place in List<>
    public Employee(int emp_no, String birth_date, String first_name, String last_name, char gender, String hire_date)
    {
        this.emp_no = emp_no;
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.hire_date = hire_date;
    }



    //getters and setters to access the private employee fields
    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHire_date() {
        return hire_date;
    }

    public void setHire_date(String hire_date) {
        this.hire_date = hire_date;
    }

    @Override
    public int compareTo(Employee o) {
        return this.last_name.compareTo(o.last_name);
    }

    @Override
    public void job() {
        System.out.println("I am a Standard employee");
    }
}

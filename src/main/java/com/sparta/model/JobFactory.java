package com.sparta.model;

import com.sparta.view.Job;

public class JobFactory {
    public Employee createEmployee(String channel, int emp_no, String birth_date, String first_name, String last_name, char gender, String hire_date)
    {
        switch(channel)
        {
            case "Developer":
                return new Developer(emp_no, birth_date, first_name, last_name, gender, hire_date);
            case "HumanResources":
                return new HumanResources(emp_no, birth_date, first_name, last_name, gender, hire_date);
            case "Marketing":
                return new Marketing(emp_no, birth_date, first_name, last_name, gender, hire_date);
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}

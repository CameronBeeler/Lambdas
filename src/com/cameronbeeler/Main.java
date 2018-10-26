package com.cameronbeeler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        Employee zoe = new Employee("Zoe", 24);
        Employee cam = new Employee("Cam", 50);
        Employee wyatt = new Employee("Wyatt", 14);
        Employee kim = new Employee("Kim", 39);
        Employee ani = new Employee("Ani", 16);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(zoe);
	    employees.add(cam);
        employees.add(wyatt);
        employees.add(kim);
        employees.add(ani);

        Collections.sort(employees, (Employee employee1, Employee employee2)->
                employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees)
        {
            System.out.println(employee.getName());
        }
    }
}

class Employee
{
    private String name;
    private int age;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public
    String getName()
    {
        return name;
    }

    public
    void setName(String name)
    {
        this.name = name;
    }

    public
    int getAge()
    {
        return age;
    }

    public
    void setAge(int age)
    {
        this.age = age;
    }
}

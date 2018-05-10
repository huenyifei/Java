package com.company;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
    private static int nextId;
//    private int id = assignId();
    private int id;
    private String name = "";
    private double salary = 0.0;
    private LocalDate hireDay = LocalDate.now();

//    private static int assignId(){
//        return nextId++;
//    }

    static{
        Random generator = new Random();
        nextId = generator.nextInt(100);
    }

    {
        id = nextId++;
    }

    public Employee() {
        name = "";
        salary = 0;
    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(String n, double s, int year, int month, int day){
        this(n,s);
        hireDay = LocalDate.of(year, month, day);
    }

    public int getId(){return id;}

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("bye");
    }
}

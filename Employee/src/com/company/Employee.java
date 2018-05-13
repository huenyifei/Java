package com.company;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Employee {
    private static int nextId;
    //    private int id = assignId();
    private int id;
    private String name = "";
    private double salary = 0.0;
    private LocalDate hireDay = LocalDate.now();
    protected String like = "pingpong";

    protected void setLike(String like) {
        this.like = like;
    }

    protected String getLike() {
        return this.like;
    }

//    private static int assignId(){
//        return nextId++;
//    }

    static {
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

    public Employee(String n, double s, int year, int month, int day) {
        this(n, s);
        hireDay = LocalDate.of(year, month, day);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int hashCode() {
//        return 7 * Objects.hashCode(name)
//                + 11 * Double.hashCode(salary)
//                + 13 * Objects.hashCode(hireDay);
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString(){
        return getClass().getName()
                +"[name=" + name
                +",salary="+salary
                +",hireDay="+hireDay
                +"]";
    }


    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (getClass() != otherObject.getClass()) return false;
//        if(!(otherObject instanceof Employee)) return false;

        Employee other = (Employee) otherObject;

        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }
}

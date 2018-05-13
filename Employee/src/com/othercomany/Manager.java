package com.othercomany;

import com.company.Employee;

public class Manager extends Employee {
    private double bonus;

    private Employee[] members;

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
        members = new Employee[2];
        members[0] = new Employee("000", 30000, 1984, 12, 21);
        members[1] = new Employee("001", 50000, 1989, 10, 1);

//        //发生编译错误
//        members[0].setLike("eating");
//        //发生编译错误
//        members[1].setLike("running");
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getSalary(){
        return super.getSalary() + bonus;
    }
//    //发生编译错误
//    public String getLike(int no){return members[no].like;}
}

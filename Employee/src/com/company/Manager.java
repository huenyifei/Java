package com.company;

public class Manager extends Employee {
    private double bonus;
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getSalary(){
        return super.getSalary() + bonus;
    }
}

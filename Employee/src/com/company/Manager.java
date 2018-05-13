package com.company;

import java.util.Objects;

public class Manager extends Employee {
    private double bonus;

    private Employee[] members;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
        members = new Employee[2];
        members[0] = new Employee("000", 30000, 1984, 12, 21);
        members[1] = new Employee("001", 50000, 1989, 10, 1);

        members[0].setLike("eating");
        members[1].setLike("running");
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public String getLike(int no) {
        return members[no].like;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;

        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    @Override
    public String toString() {
        return super.toString()
                + "[bonus" + bonus
                + "]";
    }
}

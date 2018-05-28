package com.company;

public abstract class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
    public abstract String getDescription();

    public String getName(){
        return name;
    }


    public static void main(String[] args) {
    }
}

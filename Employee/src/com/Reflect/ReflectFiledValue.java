package com.Reflect;

import java.lang.reflect.Field;


class Employee {
    private double name = 1.2;
    public Employee(double n) {
        name = n;
    }
}

public class ReflectFiledValue {

    public static void main(String[] args) throws Exception{
        Employee harry = new Employee(2.4);
        Class c1 = harry.getClass();

        Field f = c1.getDeclaredField("name");
        f.setAccessible(true);
        Object v = f.getDouble(harry);
        System.out.println(v);
    }

}

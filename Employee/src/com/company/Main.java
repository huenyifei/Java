package com.company;

public class Main {

    public static void main(String[] args) {
//        /*
//         * 命名Manager的内存空间比Employee的大
//         * 但是却不可以存放
//         */
//        Manager[] manager = new Manager[3];
//        Employee employee = new Employee("Carl Cracker", 80000, 1987, 12, 15);
//        manager[0] = employee;
//        manager[1] = new Manager("Harry Hacker", 50000, 1989, 10, 1);
//        manager[2] = new Manager("Tony Tester", 40000, 1990, 3, 15);

        /*
         * 相反Employee的内存空间比Manager的小
         * 反而可以存放
         */
        Employee[] staff = new Employee[3];
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

//        ///////////////////////////错误的复制，扰乱了存储空间///////////////////////////
//        Manager[] managers = new Manager[1];
//        managers[0] = new Manager("Carl Cracker2", 80000, 1987, 12, 15);
//        Employee[] staff2 = managers;
//        staff2[0] = new Employee();
//        /////////////////////////////////////////////////////////////////////////////////

        boss.setBonus(5000);                    //ok
        ((Manager)staff[0]).setBonus(5000);     //ok
//        staff[0].setBonus(5000);                //worry
//        ((Manager)staff[1]).setBonus(5000);     //worry

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("id=" + e.getId() + ", name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());

        for(Employee e:staff){
            System.out.println(e.getName()+":"+e.getSalary());
        }

    }
}

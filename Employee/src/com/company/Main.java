package com.company;

enum Size{SMALL, MEDIUM, LARGE, EXTRA_LARGE};

public class Main {

    public static int max(int...args){
        int result = 0;
        for(int a:args){
            if(a>result) result=a;
        };
        return result;
    }

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
        //子类赋值给超类，允许
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);



//        //超类赋值给之类，强制转换也不行
//        Manager boss2 = (Manager) staff[1];

//        ///////////////////////////错误的复制，扰乱了存储空间///////////////////////////
//        Manager[] managers = new Manager[1];
//        managers[0] = new Manager("Carl Cracker2", 80000, 1987, 12, 15);
//        Employee[] staff2 = managers;
//        staff2[0] = new Employee();
//        /////////////////////////////////////////////////////////////////////////////////

        boss.setBonus(5000);                    //ok
        ((Manager)staff[0]).setBonus(5000);     //ok
//        //需要强制转换
//        staff[0].setBonus(5000);                //worry
//        //原本不是Manager类强转也不行
//        ((Manager)staff[1]).setBonus(5000);     //worry

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("id=" + e.getId() + ", name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());

        for(Employee e:staff){
            System.out.println(e.getName()+":"+e.getSalary());
        }


        boss.setLike("fighting");
        System.out.println(boss.getLike());
        System.out.println(boss.getLike(0));
        System.out.println(boss.getLike(1));


        boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Employee emp = new Employee("Carl Cracker", 80000, 1987, 12, 15);
        System.out.println(boss.equals(emp));
        System.out.println(emp.equals(boss));

        //可变参练习
        int[] arr = new int[3];
        arr[0] = 110;
        arr[1] = 100;
        arr[2] = 101;
        System.out.println(max(arr));

        System.out.println(Size.LARGE.ordinal());

    }
}

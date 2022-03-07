package com.teksystems;

public class InheritanceActivity {

    public static void main(String[] args) {
        Employee peter= new Manager(126534L,"Peter", "Chennai India", 237844,
                65000L);
        System.out.println(peter.calculateSalary());

        Employee jack= new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        System.out.println(jack.calculateSalary());

        System.out.println(peter.calculateTransportAllowance());
        System.out.println(jack.calculateTransportAllowance());
    }

}

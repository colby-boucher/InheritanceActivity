package com.teksystems;

public class Manager extends Employee{
    Manager(long id, String name, String address, long phone, double salary){
        employeeId= id;
        employeeName= name;
        employeeAddress= address;
        employeePhone= phone;
        basicSalary= salary;
    }

    @Override
    public double calculateTransportAllowance(){
       return 15*(basicSalary/100.0);
    }
}

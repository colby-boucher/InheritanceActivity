package com.teksystems;

public class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance;
    double hra;

    Employee(){
        specialAllowance=250.80;
        hra= 1000.50;
    }
    Employee(long id, String name, String address, long phone){
        employeeId= id;
        employeeName= name;
        employeeAddress= address;
        employeePhone= phone;
    }

    public double calculateSalary(){
        return basicSalary+
                (basicSalary* (specialAllowance/100))+ (basicSalary* (hra/100));
    }

    public double calculateTransportAllowance(){
        return 10.0* (basicSalary/100);
    }
}

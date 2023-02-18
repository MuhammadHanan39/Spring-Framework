package com.springcore.RemoveXml;

public class Employee {
    private String employeeName;
    private Address address;
    private String getEmployeeSalary;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGetEmployeeSalary() {
        return getEmployeeSalary;
    }

    public void setGetEmployeeSalary(String getEmployeeSalary) {
        this.getEmployeeSalary = getEmployeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", address=" + address +
                ", getEmployeeSalary='" + getEmployeeSalary + '\'' +
                '}';
    }

    public Employee(String employeeName, Address address, String getEmployeeSalary) {
        this.employeeName = employeeName;
        this.address = address;
        this.getEmployeeSalary = getEmployeeSalary;
    }

    public Employee() {

    }
}

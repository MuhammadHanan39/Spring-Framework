package com.IOC_container;

public class Employee {
    private int employeeId;
    private String emplyeeName;
    private Address address;

    public Employee(int employeeId, String emplyeeName, Address address) {
        this.employeeId = employeeId;
        this.emplyeeName = emplyeeName;
        this.address = address;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmplyeeName(String emplyeeName) {
        this.emplyeeName = emplyeeName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmplyeeName() {
        return emplyeeName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", emplyeeName='" + emplyeeName + '\'' +
                ", address=" + address +
                '}';
    }
}

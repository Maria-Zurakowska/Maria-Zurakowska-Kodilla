package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    private final String peselId;
    private final String firstname;
    private final String lastname;
    private final BigDecimal baseSalary;

    public Employee(String peselId, String firstname, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (!getPeselId().equals(employee.getPeselId())) return false;
        if (!getFirstname().equals(employee.getFirstname())) return false;
        if (!getLastname().equals(employee.getLastname())) return false;
        return getBaseSalary().equals(employee.getBaseSalary());
    }

    @Override
    public int hashCode() {
        int result = getPeselId().hashCode();
        result = 31 * result + getFirstname().hashCode();
        result = 31 * result + getLastname().hashCode();
        result = 31 * result + getBaseSalary().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

}

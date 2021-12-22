package org.carservice.employees;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create the Domain Model Class(org.carservice.employees.Employees) to map with the "employees" table in the database.
 */

@Entity
public class Employees {
    private Integer employeePositionId;
    private String firstname;
    private String patronymic;
    private String surname;

    public Employees() {
    }

    public Employees(Integer employeePositionId, String firstname, String patronymic, String surname) {
        this.employeePositionId = employeePositionId;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public void setEmployeePositionId(Integer employeePositionId) {
        this.employeePositionId = employeePositionId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getEmployeePositionId() {
        return employeePositionId;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
}

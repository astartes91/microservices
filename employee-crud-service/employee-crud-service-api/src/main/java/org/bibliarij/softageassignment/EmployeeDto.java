package org.bibliarij.softageassignment;

import java.util.Date;

/**
 * Data transfer object for "Employee" entity
 * Created by unknown on 18.06.2017.
 */
public class EmployeeDto {

    private Long id;
    private String fullname;
    private String position;
    private String department;
    private Date employmentStartDate;
    private Date employmentEndDate;
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getEmploymentStartDate() {
        return employmentStartDate;
    }

    public void setEmploymentStartDate(Date employmentStartDate) {
        this.employmentStartDate = employmentStartDate;
    }

    public Date getEmploymentEndDate() {
        return employmentEndDate;
    }

    public void setEmploymentEndDate(Date employmentEndDate) {
        this.employmentEndDate = employmentEndDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

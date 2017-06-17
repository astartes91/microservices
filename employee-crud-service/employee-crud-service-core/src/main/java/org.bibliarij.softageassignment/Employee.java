package org.bibliarij.softageassignment;

import javax.persistence.*;
import java.util.Date;

/**
 * Employee entity class
 * Created by Vladimir Nizamutdinov on 08/June/2017.
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String fullname;
    private String position;
    private String department;

    @Column(name = "employment_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date employmentStartDate;

    @Column(name = "employment_end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date employmentEndDate;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
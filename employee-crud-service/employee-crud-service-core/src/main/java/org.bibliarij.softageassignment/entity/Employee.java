package org.bibliarij.softageassignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
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

    @Column(name = "employment_start_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime employmentStartDate;

    @Column(name = "employment_end_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime employmentEndDate;

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

    public LocalDateTime getEmploymentStartDate() {
        return employmentStartDate;
    }

    public void setEmploymentStartDate(LocalDateTime employmentStartDate) {
        this.employmentStartDate = employmentStartDate;
    }

    public LocalDateTime getEmploymentEndDate() {
        return employmentEndDate;
    }

    public void setEmploymentEndDate(LocalDateTime employmentEndDate) {
        this.employmentEndDate = employmentEndDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

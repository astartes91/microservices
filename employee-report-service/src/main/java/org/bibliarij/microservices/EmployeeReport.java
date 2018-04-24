package org.bibliarij.microservices;

/**
 * Data transfer object for employee report
 * Created by unknown on 18.06.2017.
 */
public class EmployeeReport {

    private Double averageWorkDurationInDays = 0D;
    private Long maximumWorkDurationInDays = 0L;
    private Long minimumWorkDurationInDays = 0L;


    public Double getAverageWorkDurationInDays() {
        return averageWorkDurationInDays;
    }

    public void setAverageWorkDurationInDays(Double averageWorkDurationInDays) {
        this.averageWorkDurationInDays = averageWorkDurationInDays;
    }

    public Long getMaximumWorkDurationInDays() {
        return maximumWorkDurationInDays;
    }

    public void setMaximumWorkDurationInDays(Long maximumWorkDurationInDays) {
        this.maximumWorkDurationInDays = maximumWorkDurationInDays;
    }

    public Long getMinimumWorkDurationInDays() {
        return minimumWorkDurationInDays;
    }

    public void setMinimumWorkDurationInDays(Long minimumWorkDurationInDays) {
        this.minimumWorkDurationInDays = minimumWorkDurationInDays;
    }
}

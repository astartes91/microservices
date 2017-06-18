package org.bibliarij.softageassignment;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

/**
 * Service for {@link EmployeeReport}
 * Created by unknown on 19.06.2017.
 */
@Service
public class EmployeeReportServiceImpl implements EmployeeReportService {

    private static final ZoneId ZONE = ZoneId.systemDefault();

    private static final Function<EmployeeDto, Long> EMPLOYEE_WORK_DURATION_CALCULATION =
            employeeDto -> {
                LocalDateTime startDate = LocalDateTime.ofInstant(
                        employeeDto.getEmploymentStartDate().toInstant(), ZONE
                );

                Date employmentEndDate = employeeDto.getEmploymentEndDate();
                LocalDateTime endDate =
                        employmentEndDate != null ?
                                LocalDateTime.ofInstant(employmentEndDate.toInstant(), ZONE) :
                                LocalDateTime.now();

                long between = ChronoUnit.DAYS.between(startDate, endDate);
                return between;
            };

    /**
     * Get report
     *
     * @param employees
     * @return
     */
    @Override
    public EmployeeReport createReport(List<EmployeeDto> employees) {

        EmployeeReport employeeReport = new EmployeeReport();

        int size = employees.size();
        if (size != 0){

            double doubleSize = size * 1.0;

            Double average = employees.stream()
                    .map(EMPLOYEE_WORK_DURATION_CALCULATION)
                    .reduce(Long::sum)
                    .map(sum -> sum / doubleSize)
                    .get();

            employeeReport.setAverageWorkDurationInDays(average);

            Long max = employees.stream().map(EMPLOYEE_WORK_DURATION_CALCULATION).max(Long::compareTo).get();
            employeeReport.setMaximumWorkDurationInDays(max);

            Long min = employees.stream().map(EMPLOYEE_WORK_DURATION_CALCULATION).min(Long::compareTo).get();
            employeeReport.setMinimumWorkDurationInDays(min);
        }

        return employeeReport;
    }
}

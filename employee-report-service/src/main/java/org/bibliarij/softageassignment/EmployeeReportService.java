package org.bibliarij.softageassignment;

import java.util.List;

/**
 * Service for {@link EmployeeReport}
 * Created by unknown on 18.06.2017.
 */
public interface EmployeeReportService {

    /**
     * Get report
     * @param employees
     * @return
     */
    EmployeeReport createReport(List<EmployeeDto> employees);
}

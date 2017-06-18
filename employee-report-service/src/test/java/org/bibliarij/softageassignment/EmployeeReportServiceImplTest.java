package org.bibliarij.softageassignment;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Tests for class {@link EmployeeReportServiceImpl}
 * Created by unknown on 19.06.2017.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({LocalDateTime.class, EmployeeReportServiceImpl.class})
public class EmployeeReportServiceImplTest {

    private EmployeeReportService employeeReportService = new EmployeeReportServiceImpl();
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Before
    public void setUp() throws Exception {
        LocalDateTime now = LocalDateTime.parse("2017-06-19T03:58:00");

        PowerMockito.spy(LocalDateTime.class);
        Mockito.when(LocalDateTime.now()).thenReturn(now);
    }

    /**
     * @verifies return correct results
     * @see EmployeeReportServiceImpl#createReport(List)
     * @throws Exception
     */
    @Test
    public void createReport_shouldReturnCorrectResults() throws Exception {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setEmploymentStartDate(dateFormat.parse("2017-06-17 04:00:00"));

        EmployeeDto employeeDto1 = new EmployeeDto();
        employeeDto1.setEmploymentStartDate(dateFormat.parse("2017-06-10 10:00:00"));
        employeeDto1.setEmploymentEndDate(dateFormat.parse("2017-06-20 10:00:00"));

        EmployeeReport report = employeeReportService.createReport(Arrays.asList(employeeDto, employeeDto1));
        Assertions.assertThat(report.getAverageWorkDurationInDays()).isEqualTo(5.5);
        Assertions.assertThat(report.getMaximumWorkDurationInDays()).isEqualTo(10);
        Assertions.assertThat(report.getMinimumWorkDurationInDays()).isEqualTo(1);
    }
}
package org.bibliarij.softageassignment;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for employee report
 * Created by unknown on 18.06.2017.
 */
@RestController
@RequestMapping(value = "/employee-reports", produces = "application/json")
@Api("REST controller for employee report")
public class EmployeeReportController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Get report
     * @return
     */
    @ApiOperation("Get report")
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public EmployeeDto get(){

        return employeeService.get(1L);
    }
}

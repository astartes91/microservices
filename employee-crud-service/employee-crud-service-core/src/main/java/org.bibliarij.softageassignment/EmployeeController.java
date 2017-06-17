package org.bibliarij.softageassignment;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * "REST controller for {@link Employee} entity
 * Created by unknown on 18.06.2017.
 */
@RestController
@RequestMapping(value = "/employees", produces = "application/json")
@Api("REST controller for Employee entity")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Get employee by id
     * @return
     */
    @ApiOperation("Get employee by id")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public EmployeeDto get(@PathVariable Long id){

        Employee employee = employeeRepository.findOne(id);
        if (employee != null){
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId(employee.getId());
            employeeDto.setDepartment(employee.getDepartment());
            employeeDto.setEmploymentEndDate(employee.getEmploymentEndDate());
            employeeDto.setEmploymentStartDate(employee.getEmploymentStartDate());
            employeeDto.setFullname(employee.getFullname());
            employeeDto.setPosition(employee.getPosition());
            return employeeDto;
        } else {
            return null;
        }
    }
}

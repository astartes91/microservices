package org.bibliarij.microservices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for {@link Employee} entity
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
    public Employee get(@PathVariable Long id){

        Employee employee = employeeRepository.findOne(id);
        return employee;
    }

    /**
     * Get pageable list of employees
     * @param pageable
     * @return
     */
    @ApiOperation("Get pageable list of employees")
    @RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/pageble")
    public Page<Employee> list(Pageable pageable){
        Page<Employee> list = employeeRepository.list(pageable);
        return list;
    }

    /**
     * Get list of employees
     * @return
     */
    @ApiOperation("Get list of employees")
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Employee> list(){
        return employeeRepository.list();
    }

    /**
     * Create new employee entity
     * @param employee
     * @return
     */
    @ApiOperation("Create new employee entity")
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public Employee create(@RequestBody Employee employee){
        if (employee.getId() != null){
            return null;
        }
        return employeeRepository.save(employee);
    }

    /**
     * Update existing employee entity
     * @param employee
     * @return
     */
    @ApiOperation("Update existing employee entity")
    @RequestMapping(method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    public Employee update(@RequestBody Employee employee){

        Long id = employee.getId();
        if (id == null){
            return null;
        }

        Employee employeeFromDb = get(id);
        if (employeeFromDb == null){
            return null;
        }

        return employeeRepository.save(employee);
    }

    /**
     * Archive employee entity
     * @param id
     * @return
     */
    @ApiOperation("Archive employee entity")
    @RequestMapping(method = RequestMethod.DELETE, produces = "application/json", value = "/{id}")
    public Employee archive(@PathVariable Long id){
        Employee employee = get(id);
        if (employee == null){
            return null;
        }
        employee.setStatus(Status.ARCHIVED);

        return employeeRepository.save(employee);
    }
}

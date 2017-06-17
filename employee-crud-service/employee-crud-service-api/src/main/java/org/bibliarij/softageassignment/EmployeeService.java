package org.bibliarij.softageassignment;

/**
 * Service for "Employee" entity
 * Created by unknown on 18.06.2017.
 */
public interface EmployeeService {

    /**
     * Get employee by id
     * @param id
     * @return
     */
    EmployeeDto get(Long id);
}

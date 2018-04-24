package org.bibliarij.microservices;

import java.util.List;

/**
 * Service for "Employee" entity
 * Created by unknown on 18.06.2017.
 */
public interface EmployeeService {

    /**
     * Get list of employees
     * @return
     */
    List<EmployeeDto> list();
}

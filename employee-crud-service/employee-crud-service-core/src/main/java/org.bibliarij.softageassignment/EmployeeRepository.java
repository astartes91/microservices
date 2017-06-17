package org.bibliarij.softageassignment;

import org.springframework.data.repository.CrudRepository;

/**
 * Spring data repository for {@link Employee} entity
 * Created by unknown on 18.06.2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

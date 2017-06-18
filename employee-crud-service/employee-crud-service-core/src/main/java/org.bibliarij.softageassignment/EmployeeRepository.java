package org.bibliarij.softageassignment;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring data repository for {@link Employee} entity
 * Created by unknown on 18.06.2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    /**
     * Query for pageable list of employees
     * @param pageable
     * @return
     */
    @Query(value = "SELECT e FROM Employee e", countQuery = "SELECT COUNT(e.id) FROM Employee e")
    Page<Employee> list(Pageable pageable);

    /**
     * Get list of employees
     * @return
     */
    @Query("SELECT e FROM Employee e")
    List<Employee> list();
}

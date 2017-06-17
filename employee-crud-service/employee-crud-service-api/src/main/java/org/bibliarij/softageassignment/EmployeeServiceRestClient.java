package org.bibliarij.softageassignment;

import org.springframework.web.client.RestTemplate;

/**
 * REST client for "Employee" entity
 * Created by unknown on 18.06.2017.
 */
public class EmployeeServiceRestClient implements EmployeeService {

    private RestTemplate restTemplate;
    private String url;

    public EmployeeServiceRestClient(RestTemplate restTemplate, String url) {
        this.restTemplate = restTemplate;
        this.url = url;
    }

    /**
     * Get employee by id
     *
     * @param id
     * @return
     */
    @Override
    public EmployeeDto get(Long id) {
        return restTemplate.getForObject(url.concat("/employees/{id}"), EmployeeDto.class, id);
    }
}

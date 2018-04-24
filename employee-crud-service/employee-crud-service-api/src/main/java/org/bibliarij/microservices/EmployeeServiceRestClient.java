package org.bibliarij.microservices;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

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
     * Get list of employees
     *
     * @return
     */
    @Override
    public List<EmployeeDto> list() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity entity = new HttpEntity(headers);

        ParameterizedTypeReference<List<EmployeeDto>> responseType =
                new ParameterizedTypeReference<List<EmployeeDto>>() {};
        List<EmployeeDto> list = restTemplate.exchange(
                url.concat("/employees/"), HttpMethod.GET, entity, responseType
        )
                .getBody();
        return list;
    }
}

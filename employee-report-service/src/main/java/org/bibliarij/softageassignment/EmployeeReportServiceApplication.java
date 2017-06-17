package org.bibliarij.softageassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Spring boot application main class
 * Created by unknown on 08.06.2017.
 */
@SpringBootApplication
@EnableSwagger2
public class EmployeeReportServiceApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EmployeeReportServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public EmployeeService employeeService(RestTemplate restTemplate){
        return new EmployeeServiceRestClient(restTemplate, "http://localhost:8080");
    }
}

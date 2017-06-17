package org.bibliarij.softageassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Spring boot application main class
 * Created by unknown on 08.06.2017.
 */
@SpringBootApplication
@EnableSwagger2
public class EmployeeCrudServiceApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EmployeeCrudServiceApplication.class, args);
    }
}

package org.bibliarij.softageassignment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        return mapper;
    }
}

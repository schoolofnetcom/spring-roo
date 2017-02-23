package com.schoolofnet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * = SchoolofnetApplication
 *
 * TODO Auto-generated class documentation
 *
 */
@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class SchoolofnetApplication {

    /**
     * TODO Auto-generated method documentation
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SchoolofnetApplication.class, args);
    }
}

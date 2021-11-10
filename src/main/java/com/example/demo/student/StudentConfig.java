package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miriam = new Student(
                    "Mariam",
                    LocalDate.of(2000, Month.APRIL,5),
                    "miriam.com"
            );
            Student paul = new Student(
                    "Paul",
                    LocalDate.of(2002, Month.JANUARY,5),
                    "paul.com"
            );


            repository.saveAll(
                    List.of(miriam,paul)
            );
        };
    }
}

package edu.in.batch1_sdet_trainer.spring.withspring;

import edu.in.batch1_sdet_trainer.spring.training.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Student getStudent(){
        return new Student(40);
    }
}

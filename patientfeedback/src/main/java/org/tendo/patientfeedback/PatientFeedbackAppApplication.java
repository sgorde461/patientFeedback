package org.tendo.patientfeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"classpath:application.properties"})
@ComponentScan(basePackages = {"org.tendo.patientfeedback"})
@SpringBootApplication(scanBasePackages = {"org.tendo.patientfeedback"})
public class PatientFeedbackAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientFeedbackAppApplication.class, args);
    }

}
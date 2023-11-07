package ie.atu.labexamgw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
@SpringBootApplication
public class LabExamGwApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabExamGwApplication.class, args);
    }

}

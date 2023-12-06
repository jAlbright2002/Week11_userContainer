package ie.atu.container1user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Container1UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(Container1UserApplication.class, args);
    }

}

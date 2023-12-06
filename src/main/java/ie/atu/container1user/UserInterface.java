package ie.atu.container1user;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="reg-service", url="http://reg-service:8081")
public interface UserInterface {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);
}

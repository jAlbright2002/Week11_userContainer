package ie.atu.container1user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserInterface userInterface;

    @Autowired
    public UserController(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @PostMapping("/confirm-register")
    public String confirmRegister(@RequestBody UserDetails userDetails) {
        return userInterface.someDetails(userDetails);
    }
}

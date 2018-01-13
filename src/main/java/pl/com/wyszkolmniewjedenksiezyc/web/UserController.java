package pl.com.wyszkolmniewjedenksiezyc.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerUser() {

        userService.save("dupa", "dupa");
        return "Hello";
    }
}

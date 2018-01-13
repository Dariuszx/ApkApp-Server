package pl.com.wyszkolmniewjedenksiezyc.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.wyszkolmniewjedenksiezyc.domain.entity.User;
import pl.com.wyszkolmniewjedenksiezyc.domain.service.UserService;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void registerUser(@RequestBody User user) {
        userService.save(user.getUsername(), user.getPassword());
    }

    @RequestMapping(value = "/add/coin", method = RequestMethod.PUT)
    public void addCoin(@RequestParam(name = "id", required = false) Long userId,
                        @RequestParam("value") int value) {
        userService.addCoins(userId, value);
    }
}
package pl.com.wyszkolmniewjedenksiezyc.web;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springjwt")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        return "Hello World!";
    }
}

package co.za.trclngroup.coursesapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //default method is GET request
    @RequestMapping("/hello")
    public String sayHi() {
        return "Rest API test";
    }
}

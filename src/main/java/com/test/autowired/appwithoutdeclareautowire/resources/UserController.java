package com.test.autowired.appwithoutdeclareautowire.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testing")
public class UserController {
    @RequestMapping("/autowire/{hi}")
    public String getAutowireTested(@PathVariable("hi") String autoWire) {
        return "Successfully executed the rest endpoint";
    }
}

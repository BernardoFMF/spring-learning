package com.bernardofmf.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class will be added to the container as a controller
 * The annotation adds @Component by default
 * Defines that will always return a ResponseBody
 */
@RestController
public class HelloController {
    /**
     * Could also use the following definition:
     *      @RequestMapping(value = "/", method = RequestMethod.GET)
     */
    @GetMapping("/")
    public String helloWorld() {
        return "Welcome to the Spring demo";
    }
}

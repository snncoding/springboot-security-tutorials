package com.snn.sbsecuritybasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * When we call this endpoint, the spring security will interrupt and redirect us for filling in the username and
 * password form page. After inputting the username and password we can reach this endpoint.
 */
@RestController
@RequestMapping("/home")
public class HomeController {


    @GetMapping
    public String home() {
        return "index";
    }
}

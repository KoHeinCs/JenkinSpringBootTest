package com.heinhtetaung.jenkinspringboottest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Hein Htet Aung
 * @created at 12/06/2022
 **/
@Controller
public class Index {
    @GetMapping("/")
    public String hello(){
        return "index";
    }
}

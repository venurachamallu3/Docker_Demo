package com.Docket.Docker.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("hello")
    public String welcome(){
        return "HI NAGARAJA !";
    }
}

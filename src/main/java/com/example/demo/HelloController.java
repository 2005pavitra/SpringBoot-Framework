package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/hello")
        public String sayHello(){
            return "Hello Pavitra, welcome to the first SpringBoot App";

        }

}

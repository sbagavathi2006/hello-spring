package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
//Handle request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String helloPath(){
//
//        return "Hello, Spring!";
//    }
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "GoodBye, Spring!";
    }
//Handle request of the form /hello?name=launchcode
    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
    return "Hello, "+name+"!";
    }
//Handles requests of the form /hello/launchcode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name){
    return "Hello, "+name+ "!";
    }
}

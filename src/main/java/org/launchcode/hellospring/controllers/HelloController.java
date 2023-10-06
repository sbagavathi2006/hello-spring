package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {
    @GetMapping("{n}")
    @RequestMapping(method ={RequestMethod.GET,RequestMethod.POST},value = "createMessage")
    @ResponseBody
    public String createMessage(@RequestParam String n , @RequestParam String l){
        String greet = "";

        if(l.equals("english")){
            greet = "Hello";
        } else if (l.equals("french")) {
            greet = "Bonjour";
        }
        else if (l.equals("italian")) {
            greet = "Bonjourno";
        }
        else if (l.equals("spanish")) {
            greet = "Hola";
        }
        else if (l.equals("german")) {
            greet = "Hallo";
        }

        return greet + " " + (n.isEmpty()?"World":n);
    }
    @GetMapping(value="exform")
    @ResponseBody
    public String exerciseController() {

        String html ="<html>" +
                "<body>" +
                "<form action = 'createMessage' method = 'post'>" +
                "<input type = 'text' name = 'n'/>" +
                "<select name='l'>"+
                "<option value='english'>English</option>"+
                "<option value='french'>French</option>"+
                "<option value='italian'>Italian</option>"+
                "<option value='spanish'>Spanish</option>"+
                "<option value='german'>German</option>"+
                "</select>"+
                "<input type = 'submit' value = 'Greet Me!'/>" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }

   }
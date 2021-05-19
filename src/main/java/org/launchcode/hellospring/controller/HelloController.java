package org.launchcode.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("form")
public class HelloController {

//    @RequestMapping(value = "hello", method = {RequestMethod.GET})
//    @ResponseBody
//    public String hello(@RequestParam String name) {
//        return "hello, " + name ;
//    }
//
//    @GetMapping("hello/{name}")
//    @ResponseBody
//    public String helloWithPathParam (@PathVariable String name) {
//        return "Hi, " + name + "!!!";
//    }

    @RequestMapping(method = RequestMethod.GET)
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<title>" +
                "Form Submit" +
                "</title>" +
                "<form action = 'form' method = 'post'>" +
                "<input type='text' name='name'>" +
                "<select name = 'language'>" +
                "<option value = 'english'> English </option>" +
                "<option value = 'french'> French </option>" +
                "<option value = 'italian'> Italian </option>" +
                "<option value = 'spanish'> Spanish </option>" +
                "<option value = 'german'> German </option>" +
                "<input type='submit' value = 'Greet me'>" +
                "</select>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String createMessage(@RequestParam String name, @RequestParam String language) {

        if (name == null){
            name = "world";
        }

        String greetings = "";

        if (language.equals("english")) {
            greetings = "Hello, ";
        } else if(language.equals("french")) {
            greetings = "Bonjour, ";
        } else if (language.equals("italian")) {
            greetings = "bourningano, ";
        } else if (language.equals("spanish")) {
            greetings = "hola, ";
        } else if (language.equals("german")) {
            greetings = "hallo, ";
        }
        return greetings + name;

    }

}

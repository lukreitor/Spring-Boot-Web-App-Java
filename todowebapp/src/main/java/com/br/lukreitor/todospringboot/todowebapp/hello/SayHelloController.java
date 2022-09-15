/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.lukreitor.todospringboot.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author auxlu
 */

 
@Controller
@RequestMapping(path = "/hello")
public class SayHelloController {
    //"say-hello" => "Hello! What are you learning today?"
    //http://localhost:8080/say-hello
    
    @RequestMapping(path = "/say-hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "Hello! " + name + " What are you learning today?";
    }

    @RequestMapping(value="say-hello2")
    public String sayHello2() {
        return "Hello! What are you learning today? 2";
    }
    
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Hello</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello! What are you learning today?</h1>");
        sb.append("</body>");
        return sb.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}

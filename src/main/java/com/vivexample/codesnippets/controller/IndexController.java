package com.vivexample.codesnippets.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Hello and Welcome to the CodeSnippets application. You can view/create a new code-snippet by making a POST request to /api/codesnippet endpoint."
        		+ "<br>Here is what table looks like:"
        		+ "<br>Id:"
        		+ "<br>HEADING:"
        		+ "<br>PURPOSEOFCODE:"
        		+ "<br>CODE:"
        		+ "<br>IMAGE:"
        		+ "<br>VIDEO:"        		
        		+ "<br>CREATEDDATE:"
        		+ "<br>MODIFIEDDATE:";
    }
}
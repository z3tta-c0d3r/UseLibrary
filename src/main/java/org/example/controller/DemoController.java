package org.example.controller;

import org.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class DemoController {

    @Autowired
    private TestService testService;

    @GetMapping(produces = { "application/json" })
    public String getHello() {
         testService.testHello1();
         testService.testHello2();
        return "{}";
    }

}

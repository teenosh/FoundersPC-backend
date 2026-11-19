package com.teenosh.founderspc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

}

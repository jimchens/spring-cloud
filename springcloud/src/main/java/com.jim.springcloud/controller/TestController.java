package com.jim.springcloud.controller;

import com.google.gson.Gson;
import com.jim.common.model.TestBO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        TestBO testBO = new TestBO().setName("hello");
        Gson gson = new Gson();
        return gson.toJson(testBO);
    }
}

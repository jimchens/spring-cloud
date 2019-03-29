package com.jim.feign.controller;

import com.jim.common.model.TestBO;
import com.jim.feign.service.ApiService;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class FeignCli {

    @RequestMapping("test1")
    public TestBO test(){
        ApiService apiService = Feign.builder()
                .decoder(new GsonDecoder())
                .encoder(new GsonEncoder())
                .target(ApiService.class, "http://localhost:8080");

        TestBO testBO = apiService.getTest("test");
        return testBO;
    }
}

package com.jim.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class Controller {
    @RequestMapping("test1")
    public String test(){
        return null;
    }
}

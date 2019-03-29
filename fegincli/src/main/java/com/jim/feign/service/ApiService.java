package com.jim.feign.service;

import com.jim.common.model.TestBO;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface ApiService {

    @RequestLine("GET /test/hello?name={name}")
    @Headers("Content-Type: application/json")
    TestBO getTest(@Param("name")String name);
}

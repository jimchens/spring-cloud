package com.jim.common.model;

import java.io.Serializable;

public class TestBO implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public TestBO setName(String name) {
        this.name = name;
        return this;
    }
}

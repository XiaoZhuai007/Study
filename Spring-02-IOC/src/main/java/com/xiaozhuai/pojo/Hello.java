package com.xiaozhuai.pojo;

import lombok.Setter;

public class Hello {
    private String name;

    public String getName() {
        System.out.println("name="+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * Copyright 2019 iot.iluvatar.ai(http://iluvatar.ai)
 */
package com.example.swaggerdemo.domain;

import java.io.Serializable;

/**
 * @author hua.pan
 * @since 2019/11/12
 */
public class User implements Serializable {
    private Long id;
     private String name;
     private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
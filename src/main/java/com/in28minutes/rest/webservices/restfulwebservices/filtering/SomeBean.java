package com.in28minutes.rest.webservices.restfulwebservices.filtering;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class SomeBean {

    private String filed1;
    @JsonIgnore
    private String field2;
    private String field3;

    public SomeBean(String filed1, String field2, String field3) {
        this.filed1 = filed1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getFiled1() {
        return filed1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "filed1='" + filed1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }
}

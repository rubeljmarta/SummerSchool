package com.agency04.sbss.pizza.model;

public enum Size {
    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE");

    private String size;

    Size(String size) {
        this.size = size;
    }
    public String getValue() {
        return size;
    }
}

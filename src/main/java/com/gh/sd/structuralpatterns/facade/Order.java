package com.gh.sd.structuralpatterns.facade;

import lombok.Getter;

@Getter
public class Order {

    private String id;

    private double total;

    public Order(String id, double total) {
        this.id = id;
        this.total = total;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTotal(double total) {
        this.total = total;
    }


}

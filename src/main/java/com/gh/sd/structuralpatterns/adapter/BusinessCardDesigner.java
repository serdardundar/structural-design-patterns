package com.gh.sd.structuralpatterns.adapter;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = "";

        card += customer.getName() + "\n";
        card += customer.getDesignation() + "\n";
        card += customer.getAddress() + "\n";

        return card;
    }
}

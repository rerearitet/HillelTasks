package com.antongorokh.lesson4.Extends2;

public class CommercialTax extends RealEstateTax {
    public CommercialTax(float taxK, float S, float gain) {
        super(taxK, S);
        if (gain > 0 && gain < 100) tax = 0;
    }
}

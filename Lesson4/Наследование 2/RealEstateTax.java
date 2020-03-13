package com.antongorokh.lesson4.Extends2;

public class RealEstateTax {
    float tax;
    public RealEstateTax(float taxK, float S) {
        if (taxK > 0 && S > 0) tax = taxK * S;
        else tax = 0;
    }

    @Override
    public String toString() {
        return String.valueOf((int)tax);
    }
}

package com.antongorokh.lesson4.Extends2;

public class ResidentialTax extends RealEstateTax {
    public ResidentialTax(float taxK, float S, int subsidy) {
        super(taxK, S);
        if (subsidy > 0 && subsidy < 100 && tax > 0) tax -= (tax / 100) * subsidy;
    }
}

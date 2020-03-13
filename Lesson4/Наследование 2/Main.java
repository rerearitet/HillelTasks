package com.antongorokh.lesson4.Extends2;

public class Main {
    public static void main(String[] args) {
        //initialize
        //incorrect values
        ResidentialTax residentialTax2 = new ResidentialTax(100, 1, -20);
        ResidentialTax residentialTax3 = new ResidentialTax(100, 1, 110);
        CommercialTax commercialTax2 = new CommercialTax(100, 1, -113);
        //correct values
        ResidentialTax residentialTax = new ResidentialTax(100, 1, 0);
        ResidentialTax residentialTax1 = new ResidentialTax(100, 1, 20);
        CommercialTax commercialTax = new CommercialTax(100, 1, 53);
        CommercialTax commercialTax1 = new CommercialTax(100, 1, 101);
        IndustrialTax industrialTax = new IndustrialTax(100, 1);

        //print
        //incorrect values
        System.out.println("Incorrect values: ");
        System.out.println("Residential tax with subsidy -20: " + residentialTax2.toString());
        System.out.println("Residential tax with subsidy 110: " + residentialTax3.toString());
        System.out.println("Commercial tax with gain -113: " + commercialTax1.toString() + "\n");
        //correct values
        System.out.println("Correct values:");
        System.out.println("Residential tax with subsidy 0: " + residentialTax.toString());
        System.out.println("Residential tax with subsidy 20: " + residentialTax1.toString());
        System.out.println("Commercial tax with gain 50: " + commercialTax.toString());
        System.out.println("Commercial tax with gain 101: " + commercialTax1.toString());
        System.out.println("Industrial tax: " + industrialTax.toString());
    }
}

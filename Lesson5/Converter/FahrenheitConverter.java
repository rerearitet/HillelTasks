package com.antongorokh.converter;

public class FahrenheitConverter implements Converter {
    public double convert(int celsiusDegrees) { // (°C × 9/5) + 32
        return celsiusDegrees * 1.8 + 32;
    }
}

package task15;

public class FahrenheitConverter implements Converter {
    public double convert(double degrees) {
        return degrees * 1.8 + 32;
    }
}

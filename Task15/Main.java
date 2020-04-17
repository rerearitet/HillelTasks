package task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type degrees system (Kelvin or Fahrenheit). \nExample: K");
        Converter converter = createConverter(sc.nextLine());
        System.out.println("Type the number of degrees. \nExample: 26,85");
        System.out.println(converter.convert(sc.nextDouble()));
    }

    public static Converter createConverter(String converterType) {
        switch (converterType) {
            case "K":
                return new KelvinConverter();
            default:
                return new FahrenheitConverter();
        }
    }
}

package task31;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Седан", 2000));
        cars.add(new Car("Седан", 1555));
        cars.add(new Car("Бумер", 1555));
        cars.add(new Car("Бумер", 2000));

        PrintCarsWithParameters printCarsWithParameters = (c,x, y) -> {
            for (int i = 0; i < c.size(); i++) {
                if (c.get(i).bodyType.equals(x) && c.get(i).weight < y) System.out.println(c.get(i));;
            }
        };
        printCarsWithParameters.print(cars, "Седан", 2000);
    }
}

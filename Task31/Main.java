package task31;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Седан", 2000));
        cars.add(new Car("Седан", 1555));
        cars.add(new Car("Бумер", 1555));
        cars.add(new Car("Бумер", 2000));

        Predicate carPredicate = (x) -> {
            if (x instanceof Car && ((Car) x).weight < 2000 && ((Car) x).bodyType.equals("Седан")) return true;
            else return false;
        };
        for (int i = 0; i < cars.size(); i++) if (carPredicate.test(cars.get(i))) System.out.println(cars.get(i));
    }
}

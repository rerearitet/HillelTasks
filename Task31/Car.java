package task31;

public class Car {
    String bodyType;
    int weight;

    public Car (String bodyType, int weight) {
        this.bodyType = bodyType;
        this.weight = weight;
    }

    public String toString() {
        return bodyType + " " + weight;
    }
}

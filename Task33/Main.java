package task33;

public class Main {
    public static void main(String[] args) {
        ChangeString changeString = x -> {
            return new StringBuffer(x).reverse().toString();
        };
        System.out.println(changeString.changeString("Hello World"));
    }
}

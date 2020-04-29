package task30;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeEntity(dog, (obj, name, age) -> {
            obj.setAge(age);
            obj.setName(name);
        });
        System.out.println(dog);
    }

    private static <T extends WithNameAndAge> void changeEntity(T entity, Settable<T> s) {
        s.set(entity, "Name", 0);
    }
}

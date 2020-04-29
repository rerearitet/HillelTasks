package task30;

public class Dog implements WithNameAndAge {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}

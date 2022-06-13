package Lesson7;

public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Bad", 90), new Cat("Bob", 15), new Cat("Sneak", 25), new Cat("Kuka", 5), new Cat("Kotofei", 1)};

        Plate plate = new Plate( 10);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Bars", 20, true), new Cat("Fox", 22, true),
                new Cat("Red", 10, true), new Cat("Pushok", 30, true),
        };
        Plate plate = new Plate( 40);
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

        }
    }
}

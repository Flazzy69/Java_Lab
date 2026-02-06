class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Eating " + name + " which tastes " + taste + ".");
    }
}

class Apple extends Fruit {
    Apple(String size) {
        super("Apple", "sweet", size);
    }

    @Override
    void eat() {
        System.out.println("The Apple is crunchy and has a " + taste + " flavor.");
    }
}

class Orange extends Fruit {
    Orange(String size) {
        super("Orange", "tangy", size);
    }

    @Override
    void eat() {
        System.out.println("The Orange is juicy and has a " + taste + " flavor.");
    }
}

public class Main {
    public static void main(String[] args) {
        Fruit myApple = new Apple("Medium");
        Fruit myOrange = new Orange("Small");

        myApple.eat();
        myOrange.eat();
    }
}
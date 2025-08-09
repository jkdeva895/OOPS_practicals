class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class BlueWhale extends Animal {
    void swim() {
        System.out.println("The blue whale swims gracefully.");
    }
}

public class Info {
    public static void main(String[] args) {
        BlueWhale whale = new BlueWhale();
        whale.eat();
        whale.swim();
    }
}
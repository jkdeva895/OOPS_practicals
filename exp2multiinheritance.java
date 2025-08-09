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

class BabyBlueWhale extends BlueWhale {
    void squeak() {
        System.out.println("The baby blue whale squeaks softly.");
    }
}

public class exp2multiinheritance {
    public static void main(String[] args) {
        BabyBlueWhale baby = new BabyBlueWhale();
        baby.eat();
        baby.swim();
        baby.squeak();
    }
}

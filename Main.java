// Define a class named 'Ship'
class Ship {
    // Member variables
    String name;
    String type;
    int capacity;
    String p_name; // Captain name

    // Member function
    void displayDetails() {
        System.out.println("Ship Name: " + name);
        System.out.println("Captain Name: " + p_name);
        System.out.println("Ship Type: " + type);
        System.out.println("Crew Capacity: " + capacity);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create object
        Ship blackPearl = new Ship();

        // Assign values
        blackPearl.name = "The Black Pearl";
        blackPearl.p_name = "Captain Jack Sparrow";
        blackPearl.type = "Galleon";
        blackPearl.capacity = 100;

        // Display details
        blackPearl.displayDetails();
    }
}

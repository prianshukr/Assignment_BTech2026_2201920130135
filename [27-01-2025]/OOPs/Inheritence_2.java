// Superclass: Arithmetic
class Arithmetic {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Inherits the add method from Arithmetic
}

// Main class for testing
public class Solution {
    public static void main(String[] args) {
        // Create an Adder object
        Adder adder = new Adder();

        // Display superclass name
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());

        // Call the add method and print results
        System.out.println(adder.add(42, 13));  // Prints 42 + 13 = 55
        System.out.println(adder.add(20, 0));   // Prints 20 + 0 = 20
    }
}

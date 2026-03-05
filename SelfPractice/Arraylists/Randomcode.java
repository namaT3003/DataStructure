import java.util.ArrayList;
public class Randomcode {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display elements
        System.out.println("Fruits list: " + fruits);

        // Access element
        System.out.println("First fruit: " + fruits.get(0));

        // Remove element
        fruits.remove("Banana");

        // Display updated list
        System.out.println("Updated list: " + fruits);
    }
}

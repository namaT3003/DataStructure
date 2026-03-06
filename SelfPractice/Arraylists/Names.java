import java.util.ArrayList;
public class Names {
      public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Riya");
        names.add("Rahul");

        names.set(1, "Priya");

        System.out.println(names);
    }
}

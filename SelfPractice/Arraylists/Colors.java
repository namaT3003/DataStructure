import java.util.ArrayList;

public class Colors {
        public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        colors.remove(1);

        for(String c : colors){
            System.out.println(c);
        }
    }

}

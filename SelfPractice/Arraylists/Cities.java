import java.util.ArrayList;
import java.util.Scanner;

public class Cities {
     public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            cities.add(sc.nextLine());
        }

        for(String city : cities) {
            System.out.println(city);
        }
    }
}

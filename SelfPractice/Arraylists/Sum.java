import java.util.ArrayList;

public class Sum {
   public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(80);
        marks.add(65);

        int sum = 0;

        for(int m : marks){
            sum = sum + m;
        }

        System.out.println(sum);
    } 
}

import java.util.ArrayList;
import java.util.Collections;

public class New {
        public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(40);
        nums.add(10);
        nums.add(30);
        nums.add(20);

        Collections.sort(nums);

        System.out.println(nums);
    }
}

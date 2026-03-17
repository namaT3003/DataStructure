package SelfPractice.Leetcode;
//leetcode 1470
import java.util.Arrays;

public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];

        for(int i = 0; i < n; i++){
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }

        return ans;
    }

    public static void main(String[] args) {

        ShuffleArray obj = new ShuffleArray();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = obj.shuffle(nums, n);

        System.out.println(Arrays.toString(result));
    }
}

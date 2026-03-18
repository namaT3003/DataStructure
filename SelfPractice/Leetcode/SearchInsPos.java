package SelfPractice.Leetcode;
import java.util.*;

public class SearchInsPos {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter sorted array elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = searchInsert(nums, target);

        System.out.println("Insert position: " + result);
        
        sc.close();
    }

    public static int searchInsert(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] >= target){
                return i;
            }
        }
        
        return nums.length;
    }
}

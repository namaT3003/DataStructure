package SelfPractice.Leetcode;

import java.util.Arrays;

public class SortedSquares {

    
    public static int[] SortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 0;
        int right = n - 1;
        int k = n - 1; 

        while (left <= right) {
            if (nums[right] * nums[right] > nums[left] * nums[left]) {
                arr[k] = nums[right] * nums[right];
                right--;
            } else {
                arr[k] = nums[left] * nums[left];
                left++;
            }
            k--;
        }

        return arr;
    }

  
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = SortedSquares(nums);

        System.out.println("Sorted squares: " + Arrays.toString(result));
    }
}

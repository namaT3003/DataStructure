package SelfPractice.Leetcode;
import java.util.Scanner;
class RemoveDuplicates {
    
    // Function to remove duplicates in-place and return new length
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0; // pointer for the last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // new length
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the sorted array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        RemoveDuplicates solution = new RemoveDuplicates();
        int newLength = solution.removeDuplicates(nums);
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);
        
        sc.close();
    }
}

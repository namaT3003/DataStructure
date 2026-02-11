package SelfPractice.Arrays;

public class SwapNos {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

       
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

      
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        
        System.out.println("\nAfter Swapping:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package ClassCodes.Lecture24;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int [] arr= new int [n];

        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Sorted array through bubble sort: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }




        scanner.close();
    }
}
//notdone

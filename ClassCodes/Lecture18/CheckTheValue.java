//LINEAR SEARCH

package ClassCodes.Lecture18;
import java.util.Arrays;

import java.util.Scanner;

public class CheckTheValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        // int n = scanner.nextInt();
        System.out.println("Enter the number of elements of the array: ");
        int n=scanner.nextInt();
        int[] arr=new int[n];

        for(int i=1;i<n;i++){
           // System.out.println("Enter the element: ");
            arr[i]=scanner.nextInt();
        }

        /*System.out.println("the elemnts are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
       }*/
       int value= 19;
       for(int i=0;i<n;i++){
        if(arr[i]==value){
            System.out.print(i+1);
        }
       }

        scanner.close();
    }
}

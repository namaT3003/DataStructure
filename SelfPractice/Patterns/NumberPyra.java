package SelfPractice.Patterns;

import java.util.Scanner;

public class NumberPyra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        // int n = scanner.nextInt();
           int n = 5;

        for(int i = 1; i <= n; i++) {

            
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            
            for(int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        

        scanner.close();
        }
    }
}
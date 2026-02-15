package SelfPractice.Patterns;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        // int n = scanner.nextInt();
        int n = 5;

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


        scanner.close();
    }
}

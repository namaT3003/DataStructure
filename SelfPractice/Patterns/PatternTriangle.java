package SelfPractice.Patterns;

import java.util.Scanner;

public class PatternTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        // int n = scanner.nextInt();
        int n=4;
        //int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
               
            }
            num-=2;
            for(int j=1;j<=i-1;j++){
                System.out.print(num);
                num--;
            }
            System.out.println();
            
        }

        scanner.close();
    }
}
//done try again
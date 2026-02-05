package SelfPractice.methods;

import java.util.Scanner;

public class Revnum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        // int n = scanner.nextInt();
        int num=scanner.nextInt();
        int rev=reverse(num);
        System.out.println("Reverse: "+rev);



        scanner.close();
    }
    static int reverse(int num){
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;

    }

}
//try again

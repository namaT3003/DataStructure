package SelfPractice.methods;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        
        int x=SumOfDig(n);

        System.out.println("Sum of digits: "+x);
        

        scanner.close();
    }
    static int SumOfDig(int n){
        int x=0;
        while(n!=0){
            
            int digits=n%10;
             x=x+digits;
              n=n/10;
        }
        return x;
    }

}
//tryagain
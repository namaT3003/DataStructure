//leetcode ques 202
package ClassCodes.Lecture24;

import java.util.Scanner;

public class HappyNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        isHappy(n);

        scanner.close();
    }
    static boolean isHappy( int n){
        int sum=0;
        if(n==1 or n==7){
            return true;
        }
        else if(n<10){
            return false;
        }
        else{
            while(n!=0){
                int k=n%10;
                sum+=k*k;
                n=n/10;
            }
        }
        return isHappy(sum);
    }
}

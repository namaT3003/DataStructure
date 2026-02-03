import java.util.Scanner;
import java.lang.Math;

public class sumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        int rev=0;
        while(n!=0){
            int k=n%10;
            rev=rev+k;
            n/=10;
        }
        System.out.println(Math.abs(rev));

        scanner.close();
    }

    
}
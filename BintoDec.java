import java.util.Scanner;
import java.lang.Math;

public class BintoDec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         System.out.println("Enter a number:");
         int n = scanner.nextInt();
         int sum=0;
         int g=0;
         while(n>0){
            int k=n%10;
            sum=sum+k*(Math.pow(2,g));
            n=n/10;
            g++;
         }
         System.out.println();


        scanner.close();
    }
}
//not done

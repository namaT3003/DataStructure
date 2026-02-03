import java.util.Scanner;
import java.lang.Math;

public class primenumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        boolean ans=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                ans=true;
                break;

            }
        }
        if (ans){
            System.out.println("it is not prime");
        }
        else{
            System.out.println("it is prime");
        }


        scanner.close();
    }
}
//done
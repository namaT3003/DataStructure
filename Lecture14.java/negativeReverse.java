import java.util.Scanner;

public class negativeReverse {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        int rev=0;
        while(n!=0){
            int k=n%10;
            rev=rev*10+k;
            n/=10;
        }
        System.out.println(rev);

        scanner.close();
    }
}

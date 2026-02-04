import java.util.Scanner;

public class DecToBin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int bn=1;
        while(n>0){
            int k=n%2;
            bn=bn*10+k;
            n=n/2;
        }
        System.out.print(rev(bn)/10);
        //return 0;

        scanner.close();
    }
    static int rev(int n){
        int rev=0;
        while(n!=0){
            int k=n%10;
            rev=rev*10+k;
            n=n/10;
        }
        return rev;
    }

}
//done
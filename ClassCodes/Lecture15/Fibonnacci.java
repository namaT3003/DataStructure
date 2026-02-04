

//package ClassCodes.Lecture15;
import java.util.Scanner;
public class Fibonnacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=scanner.nextInt();
        for(int i=0;i<=n-1;i++){


        System.out.println(fibbo(n));
        //return 0;
        }
    }
    static int fibbo(int g){
        // base case
        if(g==0||g==1){
            return g;
        }
        return fibbo(g-1)+fibbo(g-2);
    }
}
//not done
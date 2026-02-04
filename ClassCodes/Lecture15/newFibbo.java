import java.util.Scanner;
public class newFibbo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=scanner.nextInt();
        System.out.println (fibbo(n));
        //return 0;
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

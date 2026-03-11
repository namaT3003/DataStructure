import java.util.Scanner;
import java.util.ArrayList;
public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        // int n = scanner.nextInt();
        int n=scanner.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            int num=scanner.nextInt();
            arr.add(num);
        }
        System.out.println(arr);

        scanner.close();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class NumberGreater {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        ArrayList<Integer>num=new ArrayList<>();

        for(int i=0;i<n;i++){
            int val=scanner.nextInt();
            num.add(val);
            if(val>10){
                System.out.println(val);
            }
        }



        scanner.close();
    }
}

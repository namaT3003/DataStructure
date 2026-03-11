import java.util.ArrayList;
import java.util.Scanner;
//import java.util.ArayList;
public class EvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        // int n = scanner.nextInt();
        int n=scanner.nextInt();
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<n;i++){
            int value=scanner.nextInt();
            num.add(value);
            if(num.get(i)%2==0){
            System.out.println(num.get(i));
        }
        }
        

        scanner.close();
    }
}

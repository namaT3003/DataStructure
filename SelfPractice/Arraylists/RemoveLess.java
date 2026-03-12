import java.util.Scanner;
import java.util.ArrayList;
public class RemoveLess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        ArrayList <Integer> num= new ArrayList<>();

        for(int i=0;i<n;i++){
            int v=scanner.nextInt();
            num.add(v);
        }
        for(int i=num.size()-1;i>=0;i--){
            if(num.get(i)<10){
                num.remove(i);
            }
        }
        System.out.println(num);

        scanner.close();
    }
}
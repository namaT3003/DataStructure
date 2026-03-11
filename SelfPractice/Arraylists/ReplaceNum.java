import java.util.Scanner;
import java.util.ArrayList;
public class ReplaceNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        ArrayList<Integer>num=new ArrayList<>();
        for(int i=0;i<n;i++){
            int digit=scanner.nextInt();
            num.add(digit);
        }
        for(int i=0;i<num.size();i++){
            if(num.get(i)<0){
                num.set(i,0);
            }

        }
        System.out.println(num);


        scanner.close();
    }
}

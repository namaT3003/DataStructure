import java.util.Scanner;
import java.util.ArrayList;
public class AddtoEvenNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        ArrayList<Integer> num=new ArrayList<>();

        for(int i=0;i<n;i++){
            int value=scanner.nextInt();
            num.add(value);
        }
        for(int i=0;i<num.size();i++){
            if(num.get(i)%2==0){
                num.set(i,num.get(i)+5);
            }
        }
        System.out.println(num);





        scanner.close();
    }
}
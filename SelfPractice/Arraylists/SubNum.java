import java.util.Scanner;
import java.util.ArrayList;
public class SubNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        ArrayList<Integer>num=new ArrayList<>();

        for(int i=0;i<n;i++){
            int val=scanner.nextInt();
            num.add(val);
        }
        for(int i=0;i<num.size();i++){
            if(num.get(i)>20){
                num.set(i,num.get(i)-3);
            }
            //System.out.println();
        }
        System.out.println(num);

        scanner.close();
    }
}

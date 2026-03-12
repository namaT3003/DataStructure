import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class RemDupli {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        ArrayList<Integer> val= new ArrayList<>();

        for(int i=0;i<n;i++){
            int num=scanner.nextInt();
            val.add(num);
        }
        Collections.sort(val);
        for(int i=val.size()-1;i>0;i--){
            //Collections.sort(val);
            if(val.get(i).equals(val.get(i-1))){
                val.remove(i);
            }
        }
        System.out.println(val);


        scanner.close();
    }
}

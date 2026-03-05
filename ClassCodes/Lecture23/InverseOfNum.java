package ClassCodes.Lecture23;

import java.util.Scanner;
import java.util.Vector;

public class InverseOfNum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        // System.out.println("Enter a number:");
        Vector <Integer> number= convert(n);
        Vector <Integer> ans(number.size()+1);
        for(int i=0;i<number.size();i++){
            ans[number[i]]=i+1;
        }
        for(int i=number.size();i>=1;i--){
            System.out.print(ans[i]);
        }

        

        scanner.close();
    }
    Vector<Integer> convert(int n){
        
    }

}
}

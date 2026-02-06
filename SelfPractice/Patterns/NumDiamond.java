package SelfPractice.Patterns;

import java.util.Scanner;

public class NumDiamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int m = scanner.nextInt();
        int n=(m/2)+1;
        //int num=1;
        for(int i=1;i<=n;i++){
            int num=1;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                
                //num++;
                if(j==n){
                    System.out.print(num);
                }
                else{
                    System.out.print(i+1);
                }
            }
          
            System.out.println();
        }





        scanner.close();
    }
}
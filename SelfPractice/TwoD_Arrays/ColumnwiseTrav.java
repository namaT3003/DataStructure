package SelfPractice.TwoD_Arrays;
import java.util.Scanner;
public class ColumnwiseTrav {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int r=scanner.nextInt();
        int c=scanner.nextInt();

        int[][]arr=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        scanner.close();

    }
}

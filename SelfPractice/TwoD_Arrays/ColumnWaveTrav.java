package SelfPractice.TwoD_Arrays;
import java.util.Scanner;
public class ColumnWaveTrav {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int j = 0; j < c; j++){
            if(j % 2 == 0){
                for(int i = 0; i < r; i++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for(int i = r - 1; i >= 0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        scanner.close();
    }
}

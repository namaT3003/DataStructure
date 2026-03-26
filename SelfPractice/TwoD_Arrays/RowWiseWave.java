package SelfPractice.TwoD_Arrays;
import java.util.Scanner;

public class RowWiseWave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < r; i++){
            if(i % 2 == 0){
                for(int j = 0; j < c; j++){
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for(int j = c - 1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        scanner.close();
    }
}
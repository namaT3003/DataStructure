package ClassCodes.Lecture22;

import java.util.Scanner;

public class Chewbacca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int rev = 0;
        int l = len(n);

        while (n != 0) {

            int k = n % 10;
            int inv = 9 - k;

            if (l == 1 && k == 9) {
                rev = rev * 10 + k;
            } 
            else if (inv < k) {
                rev = rev * 10 + inv;
            } 
            else {
                rev = rev * 10 + k;
            }

            n = n / 10;
            l--;
        }

        System.out.println(rev);

        scanner.close();
    }

    static int len(int n) {
        int ans = 0;
        while (n != 0) {
            n = n / 10;
            ans++;
        }
        return ans;
    }
}

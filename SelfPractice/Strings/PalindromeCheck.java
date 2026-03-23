import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();      
        str = str.toLowerCase();              
        char[] arr = str.toCharArray();       
        boolean isPalindrome = true;          
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {       
            if (arr[i] != arr[n - 1 - i]) {       
                isPalindrome = false;
                break;                         
            }
        }

        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
package ClassCodes.Lecture38;

import java.util.Scanner;

class Solution {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) return 0;
        
        int i = 0, n = s.length();
        while(i < n && s.charAt(i) == ' ') i++;
        
        int sign = 1;
        if(i < n) {
            if(s.charAt(i) == '+') i++;
            else if(s.charAt(i) == '-') {
                sign = -1;
                i++;
            }
        }
        
        long num = 0;
        while(i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if(sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        
        return (int)(sign * num);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to integer:");
        String input = sc.nextLine();
        
        Solution solution = new Solution();
        int result = solution.myAtoi(input);
        System.out.println("Converted integer: " + result);
        
        sc.close();
    }
}
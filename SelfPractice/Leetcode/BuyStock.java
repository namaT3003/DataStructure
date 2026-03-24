package SelfPractice.Leetcode;

import java.util.Scanner;

public class BuyStock {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = BuyStock(prices);
        System.out.println(result);
    }

    public static int BuyStock(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;

        for (int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }

        return profit;
    }
}

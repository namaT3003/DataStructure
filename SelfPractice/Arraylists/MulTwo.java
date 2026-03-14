package SelfPractice.Arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class MulTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        for(int i = 0; i < list.size(); i++){
            int value = list.get(i);
            list.set(i, value * 2);
        }

        System.out.println(list);
    }
}
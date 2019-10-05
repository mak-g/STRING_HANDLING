package question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = s.charAt(i);
            a += j;
        }
        System.out.println("total weight =" + a);
    }
}

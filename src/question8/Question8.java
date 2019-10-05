package question8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(i)) >= 65 && ((int) s.charAt(i)) <= 90) {
                int j = s.charAt(i);
                a += j;
            }
        }
        System.out.println("total weight =" + a);
    }
}

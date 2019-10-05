package question9;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int a = 0;
        int g = 0;
        for (int i = 0; i < s.length(); i++) {
            if (((int) s.charAt(i)) >= 65 && ((int) s.charAt(i)) <= 90) {
                int j = s.charAt(i);
                a += j;
            } else {
                int k = s.charAt(i);
                g += k;
            }
        }
        if ((a - g) > 0) {
            System.out.println("absolute weight =" + (a - g));
        } else {
            System.out.println("absolute weight =" + Math.abs(a - g));
        }
    }
}

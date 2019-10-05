package question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().trim();
        String s1 = "";
        String s2 = inputString.toLowerCase();
        int vowelCounter = 0;
        for (int i = 0; i <= s2.length() - 1; i++) {
            if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') {
                vowelCounter += 1;
                if (vowelCounter % 3 == 1) {
                    s1 += "*";
                } else if (vowelCounter % 3 == 2) {
                    s1 += "^";
                } else {
                    s1 += "!";
                }
            } else {
                s1 += inputString.charAt(i);
            }
        }
        System.out.println(s1);
    }
}

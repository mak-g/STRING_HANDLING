package question11;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine().trim();
        char ch = s.next().charAt(0);
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ch) {
                System.out.println(i);
            }
        }
    }
}

package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();
        int a = input.length();
        System.out.print("index:");
        for (int i = 0; i < a; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        System.out.print("chars:");
        for (int i = 0; i < a; i++) {
            System.out.print("\t" + input.charAt(i));
        }
    }
}

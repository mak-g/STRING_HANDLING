package question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        String s = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            name = name.replace(s.charAt(i), '*');
        }
        System.out.println(name);
    }
}

package question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        int indexnumber = scanner.nextInt();
        System.out.println(s.substring(indexnumber));
    }
}
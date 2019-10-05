package question10;

import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine().trim();
        char ch = s.next().charAt(0);
        System.out.println("Index is =" + inputString.indexOf(ch));
    }
}

package question5;

import java.util.Scanner;


public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().trim();
        String subString = sc.nextLine();
        String replaceString = sc.nextLine();
        inputString = inputString.replaceAll(subString, replaceString);
        System.out.println(inputString);
    }
}

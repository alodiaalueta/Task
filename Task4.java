// TASK 4 ACTIVITY (STRINGBUILDER PALINDROME)

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("=====Palindrome or NOT Palindrome?=====");
        Scanner wordInput = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String wordStringChecker =wordInput.nextLine();

        StringBuilder reversed = new StringBuilder(wordStringChecker);
        reversed.reverse();
        if (wordStringChecker.equalsIgnoreCase(reversed.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

      wordInput.close();
    }
}
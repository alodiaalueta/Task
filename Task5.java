// TASK 5 ACTIVITY (IF...ELSE)

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        System.out.println("\n=====Guess the largest number among the 3=====");

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Enter number: ");
        int num1 = scanner.nextInt();

        System.out.print("2. Enter number: ");
        int num2 = scanner.nextInt();

        System.out.print("3. Enter number: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("ANSWER: ALL NUMBERS ARE EQUAL (" +num1 +"," +num2 +"," + num3 + ")");
        } else {
            int largestNum;

            if (num1 >= num2 && num1 >= num3) {
                largestNum = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                largestNum = num2;
            } else {
                largestNum = num3;
            }

            System.out.println("ANSWER: THE LARGEST NUMBER IS ("  + largestNum + ")");
        }

        scanner.close();
    }
}

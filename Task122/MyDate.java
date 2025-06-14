package Task122;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1, 1, 1978);
        DateTask date2 = new DateTask(21, 9, 1984);

        System.out.println("\nDate #1: " + date1);
        System.out.println("Date #2: " + date2);

        System.out.println("\nIs Date #1 a leap year? Answer: " + date1.isLeapYear());
        System.out.println("Is Date #2 a leap year? Answer: " + date2.isLeapYear() + "\n");
    }
}

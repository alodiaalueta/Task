// TASK 9 ACTIVITY (MATH OPERATIONS WITH STATIC IMPORT)

import static java.lang.Math.*;     
public class Task9 {
    
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

   
    public static int divide(int a, int b) {
        return floorDiv(a, b); 
    }

    
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 4;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        
        int x = 15, y = 7;
        System.out.println("\nUsing values " + x + " and " + y);
        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));  
    }
}


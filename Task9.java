// TASK 9 ACTIVITY (MATH OPERATIONS WITH STATIC IMPORT)

//import static java.lang.Math.*;     
public class Task9 {
    
    public static int add(int a, int b) {
        return Math.addExact(a, b);
    }

    
    public static int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    
    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

   
    public static int divide(int a, int b) {
        return Math.floorDiv(a, b); 
    }

    
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 4;
        System.out.println("\n====================");
        System.out.println("NUMBERS: " + num1 + " & " + num2);
        System.out.println("====================");
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
                
        int x = 7, y = 3;
        System.out.println("\n====================");
        System.out.println("NUMBERS: " + x + " & " + y);
        System.out.println("====================");
        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division: " + divide(x, y));  
    }
}


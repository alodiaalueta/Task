// TASK 8 ACTIVITY (INTEGER VARIABLE ARGUMENTS METHOD)

public class Task8 {

     public static int calculateAndPrintCumulativeSums(int... inputValues) {
        int grandTotal = 0;
		System.out.println("\n===== CUMULATIVE SUM OF 4, 5 AND 10 =====");
        
        for (int value : inputValues) {
            int currentSum = 0;
            StringBuilder sequence = new StringBuilder();

            for (int i = 1; i <= value; i++) {
                currentSum += i;
                sequence.append(i);
                if (i < value) {
                    sequence.append(" + ");
                }
            }
			
              System.out.println("\n"+ sequence + " TOTAL = (" + currentSum +")");
            grandTotal += currentSum;
        }

        System.out.println("\nOVERALL TOTAL = (" + grandTotal + ")");
        return grandTotal;
    }

    public static void main(String[] args) {
        calculateAndPrintCumulativeSums(4, 5, 10);
    }
}

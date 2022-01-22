import java.util.Scanner;

/**
 *  This class contains two methods that calculate an element, specified as an index number, of the Fibonacci series.
 *
 *  @author Estefania Sanchez
 */
public class Launcher {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a Fibonacci sequence index number to see the number at that index:");
        int index = s.nextInt();
        int result = calculateFibNumber(index);
        System.out.println("The number of the Fibonacci sequence at index " + index + " is " + result + ".");
    }

    /**
     * Calculates a specific Fibonacci series element in a recursive manner.
     *
     * @param fibIndex
     * @return The number at the specified index in the Fibonacci series.
     */
    public static int calculateFibNumber(int fibIndex) {
        if(fibIndex == 0) {
            return 0;
        } else if(fibIndex == 1) {
            return 1;
        } else {
            return calculateFibNumber(fibIndex - 1) + calculateFibNumber(fibIndex - 2);
        }
    }
}




import java.util.Scanner;

public class Launcher {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a Fibonacci sequence index number to see the number at that index:");
        int index = s.nextInt();
        int result = calculateFibNumber(index);
        System.out.println("The number of the Fibonacci sequence at index " + index + " is " + result + ".");
    }

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




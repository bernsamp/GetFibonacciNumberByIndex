import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        int result = fibonacciIterative(userInput);

        System.out.println("On the Fibonacci sequence, the index " + userInput + " has the value of " + result);
    }

        public static int fibonacciIterative(int number){

            if (number == 0) return 0;
            if (number == 1) return 1;

            int previous = 0;
            int current = 1;
            int result = 0;

            for (int i = 2; i <= number; i++)
            {
                result = current + previous;
                previous = current;
                current = result;
            }
            return result;
        }
    }
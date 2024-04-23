import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            char op;
            double num1, num2, result;

            System.out.println("Choose an operator: +, -, *, or / (or type 'q' to quit)");
            op = scanner.next().charAt(0);

            // Check if the user wants to quit
            if (op == 'q') {
                System.out.println("Exiting the program.");
                break; // Exit the loop
            }

            // Input validation for operator
            if (op != '+' && op != '-' && op != '*' && op != '/') {
                System.out.println("Invalid operator!");
                continue; // Restart the loop
            }

            // Input validation for numbers
            try {
                System.out.println("Enter first number:");
                num1 = scanner.nextDouble();

                System.out.println("Enter second number:");
                num2 = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric values.");
                scanner.nextLine(); // Clear the input buffer
                continue; // Restart the loop
            }

            // Perform arithmetic operation based on operator
            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed!");
                        continue; // Restart the loop
                    }
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
                    break;
            }
        }
    }
}

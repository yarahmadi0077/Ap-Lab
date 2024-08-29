/**
 * calculating oprand
 * @author Mohammad Yarahmadi
 * @author yarahmadi0077@aut.ac.ir
 * @version 1.0.3
 * @since 2024/04/20
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the AutMath Calculator!");

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Sum");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Factorial");
            System.out.println("6. Power");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            int num1 = 0, num2 = 0;
            if (choice >= 1 && choice <= 4 || choice == 6) {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextInt();
            } else if (choice == 5) {
                System.out.print("Enter the number: ");
                num1 = scanner.nextInt();
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + AutMath.sum(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + AutMath.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + AutMath.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + AutMath.divide(num1, num2));
                        break;
                    case 5:
                        System.out.println("Result: " + AutMath.factorial(num1));
                        break;
                    case 6:
                        System.out.println("Result: " + AutMath.pow(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
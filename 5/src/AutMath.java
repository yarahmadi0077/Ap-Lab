/**
 * calculating oprand
 * @author Mohammad Yarahmadi
 * @author yarahmadi0077@aut.ac.ir
 * @version 1.0.3
 * @since 2024/04/20
 */
public class AutMath {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1 , int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("can't devide by zero");
        }
        return num1 / num2;
    }

    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("the num can't be negetive .");
        }
        int result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }

    public static int pow(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        return result;
    }
}
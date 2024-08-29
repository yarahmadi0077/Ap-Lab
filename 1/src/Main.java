/**
 * Mohammad Yarahmadi
 * 40231059
 * Simple Calculator
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.println("please enter your numbers and your oprand : ");
        int x = input.nextInt();
        char c = input.next().charAt(0);
        int y = input.nextInt();

        /*also we can take a string as input to inputs numbers and oprand
        in this way we can get our inputs in one line
        eg ->
                String tmp = input.next();
                tmp.charAt(0) is our first num and  tmp.charAt(2) is our second num
                and tmp.charAt(1) is our oprand ............
        */

        switch (c) {
            case '+' -> System.out.printf("the sum of inputs is = %d", x + y);
            case '-' -> System.out.printf("the sub of inputs is = %d", x - y);
            case '*' -> System.out.printf("the mult of inputs is = %d", x * y);
            case '/' -> System.out.printf("the div of inputs is = %f", ((double) x / y));
        }
    }
}
/*in(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.printf("Hello and welcome!");
        System.out.println("please enter 2 number :");
        int x = input.nextInt() ; int y = input.nextInt() ;
        System.out.println("enter your oprand:");
        char c = input.next().charAt(0) ;
        }
*/

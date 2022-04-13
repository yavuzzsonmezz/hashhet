package practice01;
import java.util.Scanner;
public class Q04 {
    /*
Ask user to enter a number. If the number is less than 10 and greater
than or equal to 0, calculate its cube. Otherwise, calculate its square.
Cube of a = a*a*a Square of a = a*a
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        double isNumber = scan.nextDouble();

        double result = isNumber<10 && isNumber>=0 ? (isNumber*isNumber*isNumber):(isNumber*isNumber);
        System.out.println(result);
    }
}
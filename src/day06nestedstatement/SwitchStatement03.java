package day06nestedstatement;

import java.util.Scanner;

public class SwitchStatement03 {

    public static void main(String[] args) {
        // Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number...");
        double num1 = scan.nextDouble();
        System.out.println("Enter another number...");
        double num2 = scan.nextDouble();

        System.out.println("Select operation +, -, *, /");
        char operation = scan.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num1);
                break;
            case '%':
                System.out.println(num1 / num2 * 100);
                break;
            default:
                System.out.println("You entered an invalid data!");
                break;

        }

    }
}

package day06nestedstatement;

import java.util.Scanner;

public class NestedStatement01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password...");
        String pwd = scan.nextLine();

        //How to get first character from a string
        System.out.println(pwd.charAt(0));
        if (pwd.charAt(0) > 'A' && pwd.charAt(0) <='Z') {
            if (pwd.charAt(0) == 'A')

                System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}





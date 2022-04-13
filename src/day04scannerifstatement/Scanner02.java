package day04scannerifstatement;


import java.util.Scanner;

public class Scanner02 {


    public static void main(String[] args) {
        /* Get the firstname,middle name, lastname, SSN from user then print them like the following
        Mehmet Joseph Sonmez
        319296109
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name...");
        String firstName = scan.next();
        //String firstName = scan.next();//nextLine() takes all String, next() takes just the first word

        System.out.println("Enter your middle name....");
        String middleName = scan.next();

        System.out.println("Enter your lastname...");
        String lastName = scan.next();

        System.out.println("Enter your SSN....");
        String ssn = scan.next();
        System.out.println(firstName + " " + middleName + " " + lastName);
        System.out.println(ssn);
    }

    }

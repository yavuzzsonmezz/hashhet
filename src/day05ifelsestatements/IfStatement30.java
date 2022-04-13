package day05ifelsestatements;

import java.util.Scanner;

public class IfStatement30 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day name :");

        String day = scan.nextLine();

        if(day == "Monday"){
            System.out.println("it is weekday");
        }
        if(day == "Tuesday"){
            System.out.println("it is weekday");
        }
        if(day == "Wednesday"){
            System.out.println("it is weekday");
        }
        if(day == "Thursday"){
            System.out.println("it is weekday");
        }
        if(day == "Friday"){
            System.out.println("it is weekday");
        }
        if(day == "Saturday"){
            System.out.println("it is Weekend day");
        }
        if(day == "Sunday"){
            System.out.println("it is Weekend day");
        }
        else {
            System.out.println("it is Weekend day");
        }
    }
}



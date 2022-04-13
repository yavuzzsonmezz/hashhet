
package day05ifelsestatements;

import java.util.Scanner;

public class ElseIfStatement02 {




    //December, January , February  => winter / first condition
    //March, April, May  => spring   / second condition
    //June, July, August => summer   / third condition
    //September, October, November => fall  / fourth condition
    //else   / final condition

    //ask user to give us a month of the year

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a month name of the year");

        String month = scan.next();

        if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")){
            System.out.println(month + " is in winter");
        }else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")){
            System.out.println(month + " is in spring");
        }else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")){
            System.out.println(month + " is in summer");
        }else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")){
            System.out.println(month + " is in fall");
        }else {
            System.out.println(month+ " is not actually a MONTH of the year");
        }




    }


}
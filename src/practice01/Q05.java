package practice01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        /*
Write a code using ternary:
      Create int variable : price
      Create string variable : decision
      If the price equal or less than $10 Print "it's cheap"
      If price is 10-$20 print "it's ok"
      Otherwise "it's expensive".
      EXAMPLE:
      INPUT      : price= 12
      OUTPUT  : it's ok
      INPUT      : price= 10
      OUTPUT  : it's cheap
      INPUT      : price= 23
      OUTPUT  : it's expensive
      */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter   price : ");
        int a = scan.nextInt();
        System.out.println(a<=10?"cheap":(a<=20?"ok":"expensive"));
    }
}

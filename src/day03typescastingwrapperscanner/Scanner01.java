package day03typescastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    private static Object is;

    //Scanner Class is used to get data user in java
    public static void main(String[] args) {
        //How will we get data from user ?
        //1.step:
    Scanner scan = new Scanner(System.in);
    //2.Step:
    System.out.println("Enter your age");
    //3.Step:
    int age = scan.nextInt();
    System.out.println("The user's age is " + age);
  }
}
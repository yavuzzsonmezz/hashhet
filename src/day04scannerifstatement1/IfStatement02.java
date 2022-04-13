package day04scannerifstatement1;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer to check if it is even or odd...");
    int num = scan.nextInt();

    if(num%2==0) {
        System.out.println("Even");
    }

    if(num%2!=0){
    System.out.println("Odd");
    }

}
}

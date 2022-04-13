package practice02;

import java.util.Scanner;

public class QO9 {
    public static void main(String[] args) {

        /*Type a program to check if a positive number is perfect or not
        For example if the number is 6, we should see
        Perfect Number
        on the console.
        (The factors of 6 are : 1,2,3,6
        1+2+3=6  ==> it is perfect number )
*/

        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Please enter a number:");
        num = scan.nextInt();
        int sumOfFactors=0;
        for (int i = 1; i <num ; i++) {
            if (num%i==0){
                sumOfFactors+=i;
            }
        }
        if (sumOfFactors>0 && sumOfFactors==num){
            System.out.println(num + " is a perfect number");
        }else{
            System.out.println(num + "is not a perfect number");
        }
    }
}

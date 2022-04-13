package practice01;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        /*
Type a program that ask user their age and gender.
If age is greater or equal than 18 and if gender is male, then print man ,
If age is greater or equal than 18 and if gender is female then print woman
If age is less than 18 and if gender is male then print boy ,
If age is less than 18 and if gender is female then print girl on the console.
      */
        Scanner scan =new Scanner(System.in);
        System.out.println("How old are you");
        int age = scan.nextInt();
        System.out.println("Enter gender");
        String gender = scan.next().toLowerCase();

        if(age>=18){
            if(gender.equals("male")){
                System.out.println("man");
            }
            else{
                System.out.println("woman");
            }
        }
        else if(age<18){
            if(gender.equals("male")){
                System.out.println("boy");
            }
            else{
                System.out.println("girl");
            }
        }
    }
}

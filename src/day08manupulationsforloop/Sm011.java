package day08manupulationsforloop;

import java.util.Scanner;

public class Sm011 {

    public static void main(String[] args) {
        //1.Example: Print the first and last character of the given String on the console
        //"Java is easy" ==> Jy
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String..");
        String str = scan.nextLine();
        //1.Way:Using charAt() method
        char firstChar = str.charAt(0);
        //If you use "str.length()-1" inside the charAt() method you will get the last character in a String
        char lastChar = str.charAt(str.length()-1);
        System.out.println(""+firstChar + lastChar);
    }
}


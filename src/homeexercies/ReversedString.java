package homeexercies;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        /*Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

Note: Upper and lower case letters, spaces and special characters will not be changed.

Input :

It is very nice to write code.

Output :

.edoc etirw ot ecin yrev si tI*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String array = scan.nextLine();

        reversedmethod(array);



        System.out.println("**************");
        String a="how are you?";
        reversedmethod(a);

    }

    public static void reversedmethod(String a) {//PAY ATTENTION VOID

        String sentencearr[] = a.split("");

        for (int i = sentencearr.length - 1; i >= 0; i--) {
            System.out.print( sentencearr[i]);

        }
    }
}

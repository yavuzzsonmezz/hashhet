package day05ifelsestatements;

import java.util.Scanner;

public class IfElseStatement03 {
    public static void main(String[] args) {
        // ask user to type the weather sunny / rainy

        Scanner scan = new Scanner(System.in);

        System.out.println("Please tell us the weather if it is 'sunny' or 'rainy");

        String weather = scan.next();

        //when we compare two String, we use equals() method

        if (weather.equals("sunny")) {
            System.out.println(" We can go shopping");
        } else {
            System.out.println("We cannot go out today");
            //    }


            //If I have more than $100, then I can buy a headphone


            int amountOfMoney = 90;


            if (amountOfMoney > 100) {
                System.out.println("I can buy a headphone");
            } else {
                System.out.println("I cannot buy a headphone");
            }
        }
    }
}

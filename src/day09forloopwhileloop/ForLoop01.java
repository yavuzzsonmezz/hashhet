package day09forloopwhileloop;

public class ForLoop01 {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("=====================");
        //for loop
        for (int i = 1; i < 6; i += 1) {
            System.out.println("Hello!");
        }
        System.out.println("================");
        //2
        for (int i = 11; i < 45; i += 1) {
            System.out.print(i + " ");
        }
        //3.Example: Type even integers from 11 to 44 in the same Line with a space between consective integers
        for (int i = 11; i < 45; i += 11) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("=============");
        //4.Example
        for (int i = 68; i > 12; i -= 1) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}

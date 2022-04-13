package day06nestedstatement;

public class Ternary03 {

    public static void main(String[] args) {

        int a1 = 5;int a2 = -3;

        String result=  (a1>0 && a2>0) ? "Multiplication is " +a1*a2 : "I do not know how to multiply";
        System.out.println(result);

    }
}

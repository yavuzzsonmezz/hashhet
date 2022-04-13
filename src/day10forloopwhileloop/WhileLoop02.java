package day10forloopwhileloop;

public class WhileLoop02 {
    public static void main(String[] args) {

        //2.Example: Type code to print odd integers from 12 to 67 in the same line with a space between them
        int j = 12;
        while (j < 68) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println("=============");

        //3.Example: Type code to find the sum of integers from 12 to 67
        int k=12;
        int sum = 0;
        while(k<15){
            sum = sum + k;
            k++;
        }
        System.out.println(sum);

    }
}
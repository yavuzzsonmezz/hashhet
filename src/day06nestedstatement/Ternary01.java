package day06nestedstatement;

public class Ternary01 {

    public static void main(String[] args) {

        int num = 10;
        if(num>10) {
            System.out.println("The integer is possitive");
        }else {
            System.out.println("The integer is not possitive");
        }
        String result = num>0   ?   "The integer is possitive"  :  "The integer is not possitive";
                System.out.println(result);

                int a = 12;
                int b = 100;
                        int min = a<b ? a : b;
                System.out.print(min);
        }
        }




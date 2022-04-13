package day03typescastingwrapperscanner;

import javax.print.attribute.IntegerSyntax;

public class WrapperClasses01 {
    public static void main(String[] args){
        char c = 'd';
        Character wc = c;

        int i = 12;
        Integer wi = i;

        float f = 1.2F;
        Float wf = f;

        Short s = 23;
        short ps = s;

        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

    }
}

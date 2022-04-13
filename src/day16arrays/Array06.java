package day16arrays;

import java.util.Arrays;

public class Array06 {

    public static void main(String[] args) {

        //Print the words ending with "y" or "Y"
        // (Make code case-insensitive)
        String t = "Yavuz Learn Javcore, kazan cokpara.";
        t = t.replaceAll("\\p{Punct}","");

        String array [] = t.split(" ");
        System.out.println(Arrays.toString(array));

        for (String w : array){
            if(w.endsWith("a") || w.endsWith("A")){
                System.out.println(w + " ");
            }
        }
    }
}

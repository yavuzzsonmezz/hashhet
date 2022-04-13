package day16arrays;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        //Put each word to an array as an element
        String words = "I go to school";
        String array[] = words.split(" ");
        System.out.println(Arrays.toString(array));
        String name = "Sevval#Mustafa#Suat#Fatmanur";
        String nameArray[] = name.split("#");
        System.out.println(Arrays.toString(nameArray));
        String sentence = "Learn Java earn money";
        String arrSentence[] = sentence.split(" ");
        System.out.println(Arrays.toString(arrSentence));
    }
}
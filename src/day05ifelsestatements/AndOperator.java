package day05ifelsestatements;

public class AndOperator {

    // && operator
    // I have zoom, I can watch insructor
    // i have PC, I can write my codes

    // &&
    //true and true   => true
    //false and true    =>false
    //true and false => false
    //false and false => false

    // age 0 -  baby

    //

    public static void main(String[] args) {

        boolean money = true;
        boolean transportation = false;

        if (money && transportation) {
            System.out.println("I can go Shopping and buy something");
        } else {
            System.out.println("I can go buy anything");
        }
    }
}



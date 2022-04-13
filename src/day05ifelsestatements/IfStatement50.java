package day05ifelsestatements;
import java.util.Scanner;
public class IfStatement50 {

    public static void main(String[] args) {

        //Ask user to enter a day name then
        //print "Weekday" for Monday, Tuesday, Wednesday, Thursday, Friday
        //print "Weekend Day" for Saturday and Sunday
        //To compare string do not use "==" because it checks both addresses and values
        //When comparing string use equals method
        //This code works but I should fix it. Because in coding repetitions are not good
        //Note: ın java there is OR operator ||
        //When you use OR operator if one is true, the result will be true
        //If you user entres the day names in different cases monday-MonDaY, we can not see anything on the console
        //Java created another method for comparing strings ===> equalsIgnoreCase
        //According to equalsIgnoreCase "monday" and "Monday" and "MonDaY" is the same
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day name..");
        String dayName = scan.next();
        if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday")
                || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday")){
            System.out.println("Weekday..");
        } else if(  dayName.equalsIgnoreCase("Saturday")  ||   dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend Day");
        } else {
            System.out.println("Hey user! What are you doing? It is not a day name...");
        }
    }
}
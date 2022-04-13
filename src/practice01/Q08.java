package practice01;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the abbreviation for your favourite football club.");
        String team = scan.next().toLowerCase();

        switch (team) {

            case "gs":
                System.out.println("Galatasaray");
                break;
            case "ts":
                System.out.println("Trabzonspor");
                break;
            case "bjk":
                System.out.println("Besiktas");
                break;
            case "fb":
                System.out.println("Fenerbahce");
                break;

            default:
            System.out.println("Please enter a correct abbreviation");
        }

    }


}

package day19passbyvaluedatetimeclasses;

public class ForExample01 {
    public static void main(String[] args) {
        int i = 0;
        int x = 5;
        x = i++;
        System.out.println(i + "," + x);
        x = ++i;
        System.out.println(i + "," + x);
    }
}

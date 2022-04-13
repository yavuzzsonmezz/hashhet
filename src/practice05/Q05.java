package practice05;

import java.time.ZoneId;

public class Q05 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Y");

        sb.append("V");

        String add = "U";


        sb.append(add);

        sb.insert(1, "A");

        sb.insert(4,"Z");
        System.out.println(sb);

    }
}

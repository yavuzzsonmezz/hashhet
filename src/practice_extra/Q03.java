package practice_extra;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {

        String name = "Yavuz";
        String arr[] = new String[name.length()];

        for (int i = 0; i<arr.length; i++) {
            arr[i] = name.substring(i, i+1);


        }
        System.out.println(Arrays.toString(arr));
    }
}

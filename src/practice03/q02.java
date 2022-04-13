package practice03;

public class q02 {
    public static void main(String[] args) {

        //Create a String array whose elements are : Ali, John, ALI, Brad, Mary, Ayse
        //print the elements whose indexes are even on the console 5 adet index var cift olanlari yazdirir.
        // 0 1 2 3 4 ali0 john1 ali2 brad3 mary4 0 2 4 yani.
        String s[] = {"Ali", "John", "ALI", "Brad", "Mary", "Ayse"};
        for (int i = 0; i < s.length; i++) {
            if (i % 2 == 0) {
                System.out.println(s[i]);
            }
        }
    }
}
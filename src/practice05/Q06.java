package practice05;

public class Q06 {

    public static void main(String[] args) {

        //Type a code that joins the given Strings
        //input => "Dear", "Yavuz", "Can", "we", "miss", "you"
        //output => "Dear Yavuz Sonmez we miss you"

        join("Dear","Yavuz","Sonmez","we","miss","you");
    }

    public static void join(String... str){
        String result = "";
        for(String each : str){
            result = result + each + " ";
        }
        System.out.println(result);
    }
}

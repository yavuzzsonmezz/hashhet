package day09forloopwhileloop;

public class ForLoop011 {
    public static void main(String[] args) {

        for(int i=120;  i>10; i-=1){

            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }

        }
    }
}

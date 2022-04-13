package homeexercies;

public class Prime {
    public static void main(String args[]) {

        int count = 0;
        int number = 5;
        while (count < 10){
            if(isPrime(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


package functions.liang;

public class Ex6_27 {
    public static void main(String[] args) {
        int i = 3, count = 0;
        while (count < 100) {
            if (isPrime(i) && isPrime(getReversedDigits(i)) && getReversedDigits(i) != i) {
                System.out.print(i+ "\t");
                count++;
                if (count % 10 == 0) System.out.println();
            }
            i+=2;
        }
    }


    static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n % 2 == 0 && n > 2) isPrime = false;
        int i = 3;
        while (i < Math.sqrt(n) && isPrime) {
            if (n % i == 0) isPrime = false;
            i+=2;
        }
        return isPrime;
    }
    static int getReversedDigits(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n/10;
        }
        return reversed;
    }
}

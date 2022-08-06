package whiles;

import java.util.Scanner;

public class While22_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (n > 1): ");
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n > 2 && n % 2 == 0) isPrime = false;
        int i = 3;
        while (i < n/2 && isPrime) {
            if (n % i == 0)  isPrime = false;
            i+=2;
        }
        System.out.println(n + (isPrime ? " tub" : " murakkab") +  " son");



    }
}

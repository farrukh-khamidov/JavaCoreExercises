package whiles;

import java.util.Scanner;

public class While22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (n > 1): ");
        int n = sc.nextInt();

        boolean isPrime = true;
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        System.out.println(n + (isPrime ? " tub" : " murakkab") +  " son");



    }
}

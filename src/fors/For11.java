package fors;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = n; i <= 2 * n; i++) {
            sum += i * i;
        }

        // 1. i = n => sum = 0 + n * n = n * n
        // 2. i = n + 1 => sum = n * n + (n+1)*(n+1)
        // 3. i = n+2 => sum = n * n + (n+1)*(n+1) + (n+2)*(n+2)
        // ...
        // 4. i = 2*n => sum = n * n + (n+1)*(n+1) + (n+2)*(n+2) + ... + 2*n * 2*n

        System.out.println(sum);
    }
}

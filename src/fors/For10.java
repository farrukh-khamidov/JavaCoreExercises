package fors;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // 1. i = 1 => sum = 0 + 1.0/1 = 1
        // 2. i = 2 => sum = 1 + 1.0/2
        // 3. i = 3 => sum = 1 + 1.0/2 + 1.0/3
        // 4. i = 4 => sum = 1 + 1.0/2 + 1.0/3 + 1.0/4

        System.out.println(sum);
    }
}

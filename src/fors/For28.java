package fors;

import java.util.Scanner;

public class For28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        double prodNum = 1;
        double prodDen = 2;
        double powX = x * x;
        int sign = -1;
        double sum = 1 + x/2;

        for (int i = 2; i <= n; i++) {
            prodNum *= (2 * i - 3) ;
            prodDen *= 2*i;
            sum += sign * prodNum * powX / prodDen;
            sign = -sign;
            powX *= x;
        }

        // 1 + x/2 - 1 * x * x/(2 * 4) + ... + (1

        // 1. i = 1 => sum = 1 + x/2
        // 2. i = 2 => prodNum = 1, prodDen = 2 *(2 * 2)  sum = -1 * 1 * x2/(2 * 4)
        // 2. i = 3 => prodNum = 1 * 3, prodDen = 2 *(2 * 2) * 6  sum = sum + 1 * 3 * x3/(2 * 4 * 6)
        // 4. i = 4 => sum = 1 + 1.0/2 + 1.0/3 + 1.0/4

        System.out.println(sum);
    }
}

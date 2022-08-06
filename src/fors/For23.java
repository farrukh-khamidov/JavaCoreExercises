package fors;

import java.util.Scanner;

public class For23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        double sum = x;

        // x - x

        int sign = -1;
        long fact = 1;
        double pow = x;


        for (int i = 1; i <= n; i++) {
            pow *= x * x;
            fact *= 2*i * (2*i+1);
            sum += sign * pow / fact;
            sign = -sign;
        }

        // i = 0 => pow = x, fact = 1, sign=1 = > sum = 0 + x = sum = x
        // i = 1 => pow = x3, fact = 1 * 2 * 3, sign=-1 = > sum = x + -x3/3!
        // i = 2 => pow = x5, fact = 1 * 2 * 3 * 4 * 5, sign=-1 = > sum = x + -x3/3!
        // i = 3 => pow = x7, fact = 1 * 2 * 3 * 4 * 5 * 6 * 7, sign=-1 = > sum = x + -x3/3!
        // i = 4 => pow = x9, fact = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9, sign=-1 = > sum = x + -x3/3!

        System.out.println(sum);
    }
}

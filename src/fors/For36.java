package fors;

import java.util.Scanner;

public class For36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {
//            sum += Math.pow(i, k);
            long pow = 1;
            for (int j = 0; j < k; j++) {
                pow *= i;
            }
            sum += pow;
        }

        System.out.println(sum);

    }
}

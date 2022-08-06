package fors;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (; n <= 0; ) {
            System.out.print("Please enter positive number, n: ");
            n = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(k + " ");
        }
    }
}

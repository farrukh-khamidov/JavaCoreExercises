package arrays;

import java.util.Scanner;

public class Array60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];

        b[n-1] = a[n-1];

        for (int i = n-2; i >= 0; i--) {
            b[i] = b[i+1] + a[i];
        }

        printArray(b);

    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}

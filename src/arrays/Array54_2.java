package arrays;

import java.util.Scanner;

public class Array54_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) b[count++] = a[i];
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = b[i];
        }

        printArray(result);

    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}

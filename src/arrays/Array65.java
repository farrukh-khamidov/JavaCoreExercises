package arrays;

import java.util.Scanner;

public class Array65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter k (0 <= k < n): ");
        int k = sc.nextInt();

        int addNum = a[k];

        for (int i = 0; i < a.length; i++) {
            a[i] += addNum;
        }

        printArray(a);
    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}

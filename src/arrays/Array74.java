package arrays;

import java.util.Scanner;

public class Array74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int max, maxIndex, min, minIndex;
        max = min = a[0];
        maxIndex = minIndex = 0;

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }

        for (int i = Math.min(minIndex, maxIndex) + 1; i < Math.max(minIndex, maxIndex); i++) {
            a[i] = 0;
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

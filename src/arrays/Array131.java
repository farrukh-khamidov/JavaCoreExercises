package arrays;

import java.util.Scanner;

public class Array131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        System.out.print("Enter b: (x, y): ");
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int minIndex = 0;
        double distance, minDistance = Math.hypot(bx - x[0], by - y[0]);
        for (int i = 1; i < n; i++) {
            distance = Math.hypot(bx - x[i], by - y[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }

        System.out.println("Min distance: " + minDistance + ", Point (" + x[minIndex] + ", " + y[minIndex] + ")");

    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}

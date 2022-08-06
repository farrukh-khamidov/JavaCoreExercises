package arrays;

import java.util.Scanner;

public class Array51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int[] temp = a;
        a = b;
        b = temp;

        printArray(a);
        printArray(b);


    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}

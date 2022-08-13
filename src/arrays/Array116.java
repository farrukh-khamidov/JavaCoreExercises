package arrays;

import java.util.Scanner;

public class Array116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i-1]) count++;
        }

        int[] b = new int[count];
        int[] c = new int[count];

        int j = 0;
        int counter = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i-1]) {
                c[j] = a[i-1];
                b[j] = counter;
                counter = 1;
                j++;
            } else counter++;
        }
        b[b.length - 1] = counter;
        c[c.length - 1] = a[a.length-1];

        printArray(b);
        printArray(c);
    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}

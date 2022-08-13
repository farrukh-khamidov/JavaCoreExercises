package arrays;

import java.util.Scanner;

public class Array64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt();
        }

        int[] d = new int[3*n];


        int i, j ,k, index = 0;
        i = j = k = n-1;

        while (i >= 0 || j >= 0 || k >= 0) {
            if (i >= 0 && j >=0 && k>= 0){
                if (a[i] < b[j] && a[i] < c[k]) d[index++] = a[i--];
                if (i >= 0 && b[j] < a[i] && b[j] < c[k]) d[index++] = b[j--];
                if (i >= 0 && j >= 0 && c[k] < a[i] && c[k] < b[j]) d[index++] = c[k--];
            } else if (i >= 0 && j >=0){
                if (a[i] < b[j]) d[index++] = a[i--];
                if (i >= 0 && b[j] < a[i]) d[index++] = b[j--];
            } else if (i >= 0 && k >=0){
                if (a[i] < c[k]) d[index++] = a[i--];
                if (i >= 0 && c[k] < a[i]) d[index++] = c[k--];
            } else if (j >= 0 && k >=0){
                if (b[j] < c[k]) d[index++] = b[j--];
                if (j >= 0 && c[k] < b[j]) d[index++] = c[k--];
            } else if (i >= 0) {
                d[index++] = a[i--];
            } else if (j >= 0) {
                d[index++] = b[j--];
            } else {
                d[index++] = c[k--];
            }

        }

        printArray(d);

    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}

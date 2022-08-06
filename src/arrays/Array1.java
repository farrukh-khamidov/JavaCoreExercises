package arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] oddNumbers = new int[n];

        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = 2 * i + 1;
        }

        printArray(oddNumbers);
    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


    // foreach
    // for(type element: collection) {

    //}
}

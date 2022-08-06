package arrays;

import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }
        printArray(numbers);
        int i;
        for (i = 0; i < numbers.length-1; i++) {
            if (numbers[i] < numbers[numbers.length - 1]) {
                System.out.println(numbers[i]);
                break;
            }
        }
        if (i == numbers.length-1) System.out.println(0);
    }

    static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // 12 87 74 17 46 22 66 56 40 72
    // 1 2 4 6 7
    // 5
}

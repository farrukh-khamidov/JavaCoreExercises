package arrays;

import java.util.Scanner;

public class Array44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        first: for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(i + " " + j);
                    break first;
                }
            }
        }

    }

}

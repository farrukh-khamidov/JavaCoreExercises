package arrays;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n ; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
                count++;
            }
        }

        System.out.println("\nToqlar soni = " + count);


    }

}

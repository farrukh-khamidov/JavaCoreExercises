package arrays;

import java.util.Scanner;

public class Array40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int r = sc.nextInt();

        int min = Math.abs(r - numbers[0]), indexOfMin = 0;

        for (int i = 1; i < numbers.length; i++) {
            int abs = Math.abs(r - numbers[i]);
            if (abs < min) {
                min = abs;
                indexOfMin = i;
            }
        }

        System.out.println(numbers[indexOfMin]);

    }

}

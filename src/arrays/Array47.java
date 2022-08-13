package arrays;

import java.util.Scanner;

public class Array47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) System.out.print(numbers[i] + " ");
        }

    }

}

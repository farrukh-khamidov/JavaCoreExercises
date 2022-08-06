package arrays;

import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int min = numbers[0];

        for (int i = 2; i < numbers.length; i+=2) {
            if (numbers[i] < min) min = numbers[i];
        }

        System.out.println(min);

    }

}

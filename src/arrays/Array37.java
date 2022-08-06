package arrays;

import java.util.Scanner;

public class Array37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i-1]) count++;
        }
        System.out.println(count);
    }

}

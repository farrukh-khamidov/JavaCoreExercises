package arrays;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = numbers.length - 1; i >= 0 ; i--) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                count++;
            }
        }

        System.out.println("\nJuftlar soni = " + count);


    }

}

package arrays;

import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int i;
        for (i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i] + numbers[i + 1]) % 2 == 0) {
                System.out.println(numbers[i+1]);
                break;
            }
        }

        if (i == numbers.length - 1) System.out.println(0);



    }

}

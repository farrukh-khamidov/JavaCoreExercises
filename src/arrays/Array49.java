package arrays;

import java.util.Scanner;

public class Array49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int i;
        label: for (i = 0; i < numbers.length; i++) {
            if (numbers[i] < 1 || numbers[i] > n) {
                System.out.println(i);
                break;
            }
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    System.out.println(i);
                    break label;
                }
            }
        }
        if (i == numbers.length) System.out.println(0);
    }

}

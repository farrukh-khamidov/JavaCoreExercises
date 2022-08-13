package arrays;

import java.util.Scanner;

public class Array39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < num[i - 1]) count ++;
        }
        for (int i = 1; i < num.length; i++) {
            if (num[i] > num[i - 1]) count ++;
        }
        System.out.println(count);
    }

}

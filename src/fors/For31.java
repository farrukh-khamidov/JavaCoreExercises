package fors;

import java.util.Scanner;

public class For31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double a = 2;

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            a = 2 + 1/a;
        }

    }
}

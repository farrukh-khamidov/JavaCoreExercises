package fors;

import java.util.Scanner;

public class For29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        double step = (b-a)/n;

        for (double i = a; i <= b; i+=step) {
            System.out.println(i);
        }

    }
}

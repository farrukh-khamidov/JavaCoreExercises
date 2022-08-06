package ifs;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int min, max;

        if (a <= b && a <= c) min = a;
        else if (b <= c && b <= a) min = b;
        else min = c;

        if (a >= b && a >= c) max = a;
        else if (b >= c && b >= a) max = b;
        else max = c;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}

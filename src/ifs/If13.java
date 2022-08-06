package ifs;

import java.util.Scanner;

public class If13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int medium;

        if (a >= b && a <= c || a >= c && a <= b) medium = a;
        else if (b >= a && b <= c || b >= c && b <= a) medium = b;
        else medium = c;

        System.out.println(medium);
    }
}

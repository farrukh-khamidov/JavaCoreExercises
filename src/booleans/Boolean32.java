package booleans;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(Math.hypot(a, b) == c || Math.hypot(a, c) == b || Math.hypot(b, c) == a);


    }
}

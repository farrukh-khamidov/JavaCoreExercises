package ifs;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        if (a > 0) a++;

        System.out.println(a);
    }
}

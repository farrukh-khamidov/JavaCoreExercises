package ifs;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;

//            a = a + b;
//            b = a - b;
//            a = a - b;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

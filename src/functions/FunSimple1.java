package functions;

import java.util.Scanner;

public class FunSimple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.println("Power of a: " + powerA3(a));

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.println("Power of b: " + powerA3(b));

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        System.out.println("Power of c: " + powerA3(c));

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        System.out.println("Power of d: " + powerA3(d));

        System.out.print("Enter e: ");
        int e = sc.nextInt();

        System.out.println("Power of e: " + powerA3(e));
    }

    public static double powerA3(double a) {
        return a * a * a;
    }
}

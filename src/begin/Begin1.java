package begin;

import java.util.Scanner;

public class Begin1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        double perimeter = 4 * a;
        System.out.println("Perimeter: " + perimeter);
    }
}

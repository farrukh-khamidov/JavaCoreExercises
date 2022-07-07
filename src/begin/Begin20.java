package begin;

import java.util.Scanner;

public class Begin20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter (x2, y3): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt((x2-x1) * (x2-x1) +(y2-y1) * (y2-y1));
        System.out.println("Distance: " + distance);
    }
}

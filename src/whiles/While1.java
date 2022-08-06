package whiles;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a and b (a>b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        while (a > b) {
            a -= b;
            count++;

        }

        System.out.println("Bo'linma: " + count);

        System.out.println(a);


    }
}

package whiles;

import java.util.Scanner;

public class While30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();
        int countA = 0, countB = 0;
        while (a > c) {
            a -= c;
            countA++;
        }

        while (b > c) {
            b -= c;
            countB++;
        }

        int i = 0;
        int sum = 0;
        while (i < countB) {
            sum += countA;
            i++;
        }


        System.out.println("Natija: " + sum);




    }
}

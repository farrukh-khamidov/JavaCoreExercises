package integers;

import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // 12356 1983
        int weekDay = (k + n-1) % 7;
        System.out.println("Week day: " + weekDay);

    }
}

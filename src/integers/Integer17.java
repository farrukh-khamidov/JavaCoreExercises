package integers;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number (>999): ");

        int num = sc.nextInt();

        // 12356 1983
        int result = (num / 100) % 10;
        System.out.println("100 liklar xonasidagi son: " + result);

    }
}

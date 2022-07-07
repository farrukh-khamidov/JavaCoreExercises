package integers;

import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter K: ");

        int k = sc.nextInt();

        // 12356 1983
        int weekDay = k % 7;
        System.out.println("Week day: " + weekDay);

    }
}

package integers;

import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter l in centimeters: ");

        int l = sc.nextInt();

        int meters = l/100;
        System.out.println(l + " centimters is " + meters + " meters");

    }
}

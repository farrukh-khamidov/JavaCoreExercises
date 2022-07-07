package booleans;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter (x, y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println((x+y) % 2 == 1);
        

    }
}

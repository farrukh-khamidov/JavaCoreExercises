package fors;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a and b (a < b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = b-1; i > a ; i--) {
            System.out.print(i + " ");
            count++;
        }
        System.out.println();
        System.out.println(count);
    }
}

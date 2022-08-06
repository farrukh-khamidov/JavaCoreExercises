package integers;

import java.util.Scanner;

public class Integer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = sc.nextInt();

        int tens = n/10;
        int ones = n%10;

        System.out.println("O'nliklar xonasidagai raqam: " + tens);
        System.out.println(n%10);

    }
}

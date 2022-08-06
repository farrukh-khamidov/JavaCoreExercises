package whiles;

import java.util.Scanner;

public class While24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (n > 1): ");
        int n = sc.nextInt();

        int f = 1, fp = 1, temp;
        while (f < n) {
            temp = f;
            f = f + fp;
            fp = temp;
        }

        if (f == n) System.out.println(n + " fibonachchi soni");
        else System.out.println(n + " fibonachchi soni emas");




    }
}

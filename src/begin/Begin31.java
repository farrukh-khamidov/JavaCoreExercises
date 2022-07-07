package begin;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter TF: ");
        double tf = sc.nextDouble();

        double tc = (tf-32) * 5 / 9;

//        System.out.println(tf + " farengeyt is equal to " + tc + " celcius.");

        System.out.printf("%.1f farengeyt is equal to %.2f celcius.", tf, tc);


    }
}

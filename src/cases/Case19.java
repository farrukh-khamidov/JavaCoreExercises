package cases;

import java.util.Scanner;

public class Case19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // 1=> yashil
        // 2=> qizil
        // 3=> sariq
        // 4=> oq
        // 5=> qora


        // 1984 => 0 => yashil sichqon
        // 1985 => 1 => yashil sigir
        // ..
        // 1995 => 11=> yashil to'ngiz
        // 1996 => 0 => qizil to'ngiz
        // 1997 => 1 => qizil to'ngiz

        year -= 1984;
        int color = year / 12;
        int animal = year % 12;

        color %= 5;

        switch (color){
            case 0:
                System.out.print("Yashil");
                break;
            case 1:
                System.out.print("Qizil");
                break;
            case 2:
                System.out.print("Sariq");
                break;
            case 3:
                System.out.print("Oq");
                break;
            case 4:
                System.out.print("Qora");
                break;
        }

        switch (animal){
            case 0:
                System.out.print(" sichqon");
                break;
            case 1:
                System.out.print(" sigir");
                break;
            case 2:
                System.out.print(" yo'lbars");
                break;
            case 3:
                System.out.print(" quyon");
                break;
            case 4:
                System.out.print(" ajdar");
                break;
            case 5:
                System.out.print(" ilon");
                break;
            case 6:
                System.out.print(" ot");
                break;
            case 7:
                System.out.print(" qo'y");
                break;
            case 8:
                System.out.print(" maymun");
                break;
            case 9:
                System.out.print(" tovuq");
                break;
            case 10:
                System.out.print(" it");
                break;
            case 11:
                System.out.print(" to'ng'iz");
                break;
        }

        System.out.println(" yili");

    }
}

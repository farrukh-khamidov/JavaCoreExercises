package cases;

import java.util.Scanner;

public class Case20_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        if (month == 1 && day >= 20 || month == 2 && day <= 18) System.out.println("Qovg'a");
        else if (month == 2 && day >= 19 || month == 3 && day <= 20) System.out.println("Baliq");
        else if (month == 3 && day >= 21  || month == 4 && day <= 19) System.out.println("Qo'y");
        else if (month == 4 && day >= 20 || month == 5 && day <= 20) System.out.println("Buzoq");
        else if (month == 5 && day >= 21 || month == 6 && day <= 21) System.out.println("Egizaklar");
        else if (month == 6 && day >= 22 || month == 7 && day <= 22) System.out.println("Qisqichbaqa");
        else if (month == 7 && day >= 23 || month == 8 && day <= 22) System.out.println("Arslon");
        else if (month == 8 && day >= 23 || month == 9 && day <= 22) System.out.println("Parizod");
        else if (month == 9 && day >= 23 || month == 10 && day <= 22) System.out.println("Tarozi");
        else if (month == 10 && day >= 23 || month == 11 && day <= 22) System.out.println("Chayon");
        else if (month == 11 && day >= 23 || month == 12 && day <= 21) System.out.println("O'qotar");
        else if (month == 12 && day >= 22 || month == 1 && day <= 19) System.out.println("Echki");







    }
}

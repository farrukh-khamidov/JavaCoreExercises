package cases;

import java.util.Scanner;

public class Case20_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        switch (month) {
            case 1: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else System.out.println("Qovg'a");
                break;
            }
            case 2: {
                if (day <= 18 && day > 0) System.out.println("Qovg'a");
                else System.out.println("Baliq");
                break;
            }
            case 3: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else System.out.println("Qovg'a");
                break;
            }
            case 4: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }
            case 5: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }
            case 6: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }
            case 7: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }
            case 8: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }
            case 9: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }
            case 10: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }
            case 11: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }
            case 12: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }

        }


    }
}

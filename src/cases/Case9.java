package cases;

import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();


//        if (month == 2) {
//            if (day < 28) day++;
//            else {
//                day = 1;
//                month++;
//            }
//        } else if (month == 4 || month == 6 || month == 9 || month == 11){
//            if (day < 30) day++;
//            else {
//                day = 1;
//                month++;
//            }
//        } else {
//            if (day < 31) day++;
//            else {
//                day = 1;
//                month++;
//            }
//        }


        switch (month) {
            case 2: {
                switch (day/28) {
                    case 0:
                        day++;
                        break;
                    case 1:
                        day = 1;
                        month++;
                        break;
                }
                break;
            }
            case 4:case 6:case 9:case 11: {
                switch (day/30) {
                    case 0:
                        day++;
                        break;
                    case 1:
                        day = 1;
                        month++;
                        break;
                }
                break;
            }
            case 1:case 3:case 5:case 7:case 8:case 10:{
                switch (day/31) {
                    case 0:
                        day++;
                        break;
                    case 1:
                        day = 1;
                        month++;
                        break;
                }
                break;
            }
            case 12: {
                switch (day/31) {
                    case 0:
                        day++;
                        break;
                    case 1:
                        day = 1;
                        month = 1;
                        break;
                }
                break;
            }
        }

        System.out.println("Month: " + month);
        System.out.println("Day: " + day);


    }
}

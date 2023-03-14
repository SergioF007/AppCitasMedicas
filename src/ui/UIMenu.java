package ui;

import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS ={"Enero", "Febrero", "Marzo", "Abril", "Mayo","Junio","Julio","Septiembre","Octubre","Noviembre","Diciembre" };

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Select the option you want");
        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    System.out.println("Patient");
                    showPatientMenu();
                    response = 0;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    static void showPatientMenu() {
        int response = 0;


        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println(":: Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i+ ". " + MONTHS[i-1] );
                    }
                    break;
                case 2:
                    System.out.println(":: My appointment");
                    break;
                case 0:
                    System.out.println(":: Exit");
                    showMenu();
                    break;
                default:
                    System.out.println("Please enter a valid option ");
            }

        }while (response != 0);


    }
}

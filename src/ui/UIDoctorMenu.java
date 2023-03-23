package ui;

import groovy.lang.GString;

import java.util.Scanner;

public class UIDoctorMenu {

    public static void showDoctorMenu() {

        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println(":: Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogeed.getName());
            System.out.println("1. Add available Appoinment");
            System.out.println("2. My scheduled appointments");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response != 0);
    }

    public static void showAddAvailableAppointmentsMenu() {

        int response = 0;

        do {
            System.out.println();
            System.out.println(":: Add Available Appointment");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 3; i++) {

                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
             if (response > 0 && response >4) {

                 int monthSelected = response;
                 System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected-1]);
                 System.out.println("Insert the date available: [DD/MM/YYYY]");
                 String date = sc.nextLine();
                 //confirmacion
                 System.out.println("Your date is: "+ date + "\n 1. Correcte" + "\n 2. Change Date");
                 int responseDate = Integer.valueOf(sc.nextLine());
                 if (responseDate == 2) continue;
                 // seguimos a seleccionar la hora que el doctor tiene disponible para cita
                 int responseTime= 0;
                 String time = "";
                  do {
                      System.out.println();
                      System.out.println("Insert the time available for date: " + date + "[24:00]");
                      time = sc.nextLine();
                      // confirmacion
                      System.out.println("Your time is: " + time + "\n 1. Correcte" + "\n 2. Change time ");
                      responseTime = sc.nextInt();

                  }while (responseTime == 2);

                  // Despues de tomar y confirmar los datos la citas disponlibles del Doctor
                  // vamamos a implementar el metodo para agregar esta citas




             }else if (response == 0) {
                 showDoctorMenu();
             }

        }while (response != 0);




    }
}
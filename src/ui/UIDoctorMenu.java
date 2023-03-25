package ui;

import Modelo.Doctor;
import groovy.lang.GString;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UIDoctorMenu {

    // Vamos a crear una Colleccion de doctores con citas disponibles
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();


    public static void showDoctorMenu() {

        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println(":: Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available Appoinment");
            System.out.println("2. My scheduled appointments");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    response = 0;
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
            if (response > 0 && response < 4) {

                 int monthSelected = response;
                 int responseDate = 0;
                 String date = "";

                 /*
                 do {
                     System.out.println("\n\n");
                     System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected-1]);
                     System.out.println("Insert the date available: [DD/MM/YYYY]");
                     date = sc.nextLine();
                     System.out.println("Your date is: "+ date + "\n 1. Correcte" + "\n 2. Change Date");
                     responseDate = Integer.valueOf(sc.nextLine());

                 }while (responseDate == 2);
                */
                System.out.println("\n\n");
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected-1]);
                System.out.println("Insert the date available: [DD/MM/YYYY]");
                date = sc.nextLine();
                System.out.println("Your date is: "+ date + "\n 1. Correcte" + "\n 2. Change Date");
                responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;

                 // seguimos a seleccionar la hora que el doctor tiene disponible para cita
                 int responseTime= 0;
                 String time = "";
                  do {
                      System.out.println();
                      System.out.println("Insert the time available for date: " + date + "[24:00]");
                      time = sc.nextLine();
                      // confirmacion
                      System.out.println("Your time is: " + time + "\n 1. Correcte" + "\n 2. Change time ");
                      responseTime = Integer.valueOf(sc.nextLine());

                  }while (responseTime == 2);

                  // Despues de tomar y confirmar los datos la citas disponlibles del Doctor
                  // vamamos a implementar el metodo para agregar esta citas
                 UIMenu.doctorLogged.addAvalableAppointment(date, time);
                 checkDoctorAvailableAppointements(UIMenu.doctorLogged);

            }else if (response == 0) {
                showDoctorMenu();
            }
        }while (response != 0);
    }

    // Metodo checkDoctorAvailableAppointements para mirar la citas disponibles de Doctor

    public static void checkDoctorAvailableAppointements(Doctor doctor) {

        //Entramos hacer un par de validaciones: Si tiene citas disponibles y si el Doctor existe en la lista que creamos
        // hay si añada las citas que se crearon.
        if (doctor.getAvailableAppointments().size() >0
            && !doctorsAvailableAppointments.contains(doctor) ) {

            doctorsAvailableAppointments.add(doctor);
        }

    }
}

package ui;

import Modelo.Doctor;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void  showPatientMenu() {

        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println(":: Patient");
            System.out.println(":: Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointment");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private static void showBookAppointmentMenu() {

        int response = 0;

        do {
            System.out.println(":: Book an appointment");
            System.out.println(":: Select date");
            //Numeracion de la lista de fechas
            //Indicie de la fehcha que seleccionada
            //[doctors]
            // 1.doctor1
                //1.fecha1
                //2.fecha2
            // 2.doctor2
            // 3.doctor3
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();



        }while (response != 0);
    }


}

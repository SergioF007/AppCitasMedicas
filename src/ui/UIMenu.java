package ui;

import Modelo.Doctor;
import Modelo.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS ={"Enero", "Febrero", "Marzo", "Abril", "Mayo","Junio","Julio","Septiembre","Octubre","Noviembre","Diciembre" };

    public static Doctor doctorLogged;

    public static Patient patientLogged;
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
                    authUser(1); // Ejecuta la validacion comparandolo con la lista doctors
                    response = 0;
                    break;
                case 2:
                    System.out.println("Patient");
                    authUser(2);
                    response = 0;
                case 0:
                    System.out.println("Thank you for you visit");
                    response = 0;
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    //metodo autenticaiones  authUser
    // Con el Fin de saber quien quien es Doctor o Patient
    // vamos hacer la simularicon

    private static void authUser(int userType) {
        //Docotor userType = 1
        //Patien userType = 2
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Sergio Fernandez Salazar", "sfs@gamil.com"));
        doctors.add(new Doctor("Sebastian ramon", "seb@gamil.com"));
        doctors.add(new Doctor("Camilo Rodrigrez", "cam@gamil.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Jose Fernandez", "jse@gamil.com"));
        patients.add(new Patient("Paula fernanda", "ptf@gamil.com"));
        patients.add(new Patient("Daniel Gomez", "dni@gamil.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {

                for (Doctor d: doctors) {
                    if(d.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Obtener el ususario logeado
                        doctorLogged = d;
                        //showDoctorMenu
                        UIDoctorMenu.showDoctorMenu();
                    }
                }

            } else if (userType == 2) {
                for (Patient p : patients) {
                    if(p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }

        } while(!emailCorrect);

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

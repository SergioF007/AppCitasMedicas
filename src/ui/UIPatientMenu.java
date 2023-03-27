package ui;

import Modelo.Doctor;
import Modelo.Patient;

import javax.print.Doc;
import java.util.ArrayList;
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
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
                    System.out.println("Please enter a valid option ");
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
            int k = 0;
            // Primero vamos a recorrer la Lista de Doctores con citas Disponible
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                // creamos una lista para guardar la lista de las citas dispobibles de todos los doctores
                // availableAppointments es: el objetos doctor de citar disponible en gestion y su metodo para tommar la lista de citas
                // es como si estuviera capturando la lista de citas disponible del doctor para luego recorrerla, ya que este metodo las muestra
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    // creamos el map interior para recibir el idicie de la fecha y la fecha asociada el doctor.
                    Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                    k ++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate() + " /" + UIDoctorMenu.doctorsAvailableAppointments.get(i).getName());
                    doctorAppointments.put(Integer.valueOf(j) , UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k) , doctorAppointments);
                }


            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            // Cremo una colleccion Map para guardar los objetos de cita que seleccione el paciente
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc:doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(":: Appointment " +
                    "\n Fecha: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    "\n Hora: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime() +
                    "\n Doctor: " + doctorSelected.getName()) ;
            System.out.println("Confirm your appointment:  " + " 1. Yes" + " 2. Change Data");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1) {
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPatientMenu();
            }
        }while (response != 0);
    }

    //Metodo para mostrar mis citas
    private static void showPatientMyAppointments(){

        int response = 0;
        do {
            System.out.println(":: My Appointments");

            if(UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {
                System.out.println("Don't have appointments");

            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {

                int j = i + 1;

                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        "Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "Doctor:" + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());

            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            if (response != 0) continue;

            showPatientMenu();

        }while (response != 0);
    }
}

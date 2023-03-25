package ui;

import Modelo.Doctor;

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
            int k = 0;
            // Primero vamos a recorrer la Lista de Doctores con citas Disponible
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                // creamos una lista para guardar la lista de las citas dispobibles de todos los doctores
                // availableAppointments es: el objetos doctor de citar disponible en gestion y su metodo para tommar la lista de citas
                // es como si estuviera capturando la lista de citas disponible del doctor para luego recorrerla, ya que este metodo las muestra
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                // creamos el map interior para recibir el idicie de la fecha y la fecha asociada el doctor.
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k ++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j) , UIDoctorMenu.doctorsAvailableAppointments.get(j));
                    doctors.put(Integer.valueOf(k) , doctorAppointments);
                }

                Scanner sc = new Scanner(System.in);
                int responseDateSelected = Integer.valueOf(sc.nextLine());
                // Cremo una colleccion Map para guardar los objetos de cita que seleccione el paciente
                Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            }

        }while (response != 0);
    }


}

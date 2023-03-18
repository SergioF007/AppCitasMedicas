import ui.Patient;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        // creo un Doctor
        Doctor myDoctor = new Doctor("Jose Ignacio Fernández", "Cardiologia");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        // creo un paciente
        Patient patient = new Patient("Jame Rodrigez", "jame10@gmail.com");
        System.out.println(patient.name);
        System.out.println(patient.email);

        patient.weight = 65; // Kg
        patient.height = 1.80; // m

        System.out.println(patient.weight);
        System.out.println(patient.height);


    }
}

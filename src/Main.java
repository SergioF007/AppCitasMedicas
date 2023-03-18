import ui.Patient;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        // creo un Doctor
        Doctor myDoctor = new Doctor("Jose Ignacio Fernández", "Cardiologia");


        // creo un paciente
        Patient patient = new Patient("Jame Rodrigez", "jame10@gmail.com");
        patient.setWeight(80);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());




    }
}

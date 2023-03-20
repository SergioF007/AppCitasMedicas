import ui.Patient;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        // creo un Doctor
        Doctor myDoctor = new Doctor("Jose Ignacio Fernández", "Cardiologia");
        System.out.println(myDoctor);

        myDoctor.addAvalableAppointment(new Date(), "1:00pm" );
        myDoctor.addAvalableAppointment(new Date(), "2:00pm" );
        myDoctor.addAvalableAppointment(new Date(), "3:00pm" );

        System.out.println(myDoctor.getAvailableAppointments());

        for(Doctor.AvailableAppointment cita : myDoctor.getAvailableAppointments()) {
            System.out.println(cita.getDate() + " " + cita.getTime());
        }
        // creo un paciente
        System.out.println();
        Patient patient = new Patient("Jame Rodrigez", "jame10@gmail.com");
        System.out.println(patient);


    }
}

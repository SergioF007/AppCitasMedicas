import java.util.Date;
import java.util.Scanner;

public class Doctor {
    //Atributos
    private static int id = 0; //Autoincrement
    private String name;
    private String speciality;

    // Atributos de la clase anidada staic AvailableAppointment
    private int id_availableAppointment;

    private Date date;
    private String time;


    public Doctor() {
        id++;
        System.out.println("Contruyendo el Objeto Doctor");

    }

    public Doctor(String name, String speciality) {
        System.out.println("El nombre del Doctro Asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){

        System.out.println(name);
    }
    public void showID(){

        System.out.println("ID Doctor: " + id);
    }


    public static class AvailableAppointment {

        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }


}

package Modelo;

import Modelo.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos

    private String speciality;

    public Doctor(String name, String email) {
        super(name, email);

        System.out.println("El nombre del Doctro Asignado es: " + name);
    }

    @Override
    public void showDateUser() {
        System.out.println("Doctor del Hospital: Cruz Roja");
        System.out.println("Departemento: Cancerología");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static class AvailableAppointment {

        private int id;
        private Date date;
        private String time;

        // Creamos un clase a una variables para formatiar el tipo de dato fecha
        SimpleDateFormat format = new SimpleDateFormat("DD/MM/YYYY");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
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

        // sobre escribo el metodo setDate para que me reciba un String

        public String getDate(String DATE) {
            return format.format(date);

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

    // Creo una colleccion de objetos AvailableAppointment
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // metodo para agregar citas
    public void addAvalableAppointment(String date, String time) {

        availableAppointments.add(new AvailableAppointment(date,time));

    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality;
    }


}

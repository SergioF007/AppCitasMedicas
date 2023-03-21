package Modelo;

import Modelo.User;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos

    private String speciality;

    public Doctor(String name, String email) {
        super(name, email);

        System.out.println("El nombre del Doctro Asignado es: " + name);
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

    // Creo una colleccion de objetos AvailableAppointment
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // metodo para agregar citas
    public void addAvalableAppointment(Date date, String time) {
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

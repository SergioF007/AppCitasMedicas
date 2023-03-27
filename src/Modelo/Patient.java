package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();

    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();


    public Patient(String name, String email) {
        super(name, email);

    }

    @Override
    public void showDateUser() {
        System.out.println("Paciente");
        System.out.println("Historial");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + " Weigth: " + getWeight() + "\nHeight: " + getHeight() + " Blood: " + blood;
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    // Cambio los parametros del metodo getAppointmentDoctors
    // y renombreo el metodo por addAppointmentDoctors
    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getWeight() {
        return this.weight + " Kg.";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getHeight() {
        return height;
    }

    public String setHeight(double height) {
        return height + " Mts.";
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}

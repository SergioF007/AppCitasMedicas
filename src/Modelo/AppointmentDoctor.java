package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentDoctor implements ISchedulable {

    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public AppointmentDoctor(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate(String DATE) {
        return date;
    }

    public String getDate() {
        return format.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time + "Hrs";
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {
        this.date = date;
        this.time = time; 
    }
}

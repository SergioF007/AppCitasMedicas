package Modelo;

import java.util.Date;

public class AppointmentNurse {

    private int id;
    private Patient patient;
    private Nurse nurse;
    private Date date;
    private String time;

    public AppointmentNurse(int id, Patient patient, Nurse nurse, Date date, String time) {
        this.id = id;
        this.patient = patient;
        this.nurse = nurse;
        this.date = date;
        this.time = time;
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

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
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

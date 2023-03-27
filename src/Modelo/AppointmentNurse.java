package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppointmentNurse implements ISchedulable {

    private int id;
    private Patient patient;
    private Nurse nurse;
    private Date date;
    private String time;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");


    public AppointmentNurse(Patient patient, Nurse nurse) {
        this.patient = patient;
        this.nurse = nurse;
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
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {

    }
}

package Modelo;

public class Nurse extends User {

    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality;
    }

}

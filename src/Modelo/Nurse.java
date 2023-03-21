package Modelo;

public class Nurse extends User {

    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDateUser() {
        System.out.println("Enfermera del Hospital: Cruz Verde");
        System.out.println("Area: Nutriología, Pediatría");
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

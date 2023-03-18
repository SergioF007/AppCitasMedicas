import java.util.Scanner;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String email;
    String speciality;
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
}

import java.util.Scanner;

public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    public Doctor() {
        id++;
        System.out.println("Contruyendo el Objeto Doctor");

    }

    public Doctor(String name) {
        System.out.println("EL nombre del Doctor asignado es: " + name);
    }

    //Comportamientos
    public void showName(){

        System.out.println(name);
    }

    public void showID(){
        System.out.println("ID Doctor: " + id);
    }


}

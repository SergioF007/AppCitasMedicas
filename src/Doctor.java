public class Doctor {

    int id;
    String name;
    String speciality;

    public Doctor() {
        System.out.println("Contruyendo el Objeto Doctor");
    }

    public Doctor(String name) {
        System.out.println("EL nombre del Doctor asignado es: " + name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
}

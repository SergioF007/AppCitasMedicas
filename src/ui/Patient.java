package ui;

public class Patient {

    static int id = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;


    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

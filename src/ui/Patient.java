package ui;

public class Patient {

    static int id = 0;
    public String name;
    public String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    public double weight;
    public double height;
    private String blood;


    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

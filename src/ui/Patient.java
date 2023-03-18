package ui;

public class Patient {

    int id = 0;
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

    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getWeight() {
        return this.weight + " Kg.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        if (phoneNumber.length()==8){
            this.phoneNumber = phoneNumber;
        }else {
            System.out.println("El numero de telefono debe ser de 8 Digitos");
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getHeight() {
        return height;
    }

    public String setHeight(double height) {
        return height + " Mts.";
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}

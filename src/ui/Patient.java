package ui;

public class Patient extends User{

    private String birthday;
    private double weight;
    private double height;
    private String blood;


    public Patient(String name, String email) {
        super(name, email);

    }


    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getWeight() {
        return this.weight + " Kg.";
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

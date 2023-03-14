import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Sergio Fernandez Salazar";
        myDoctor.showName();
        myDoctor.showID();
        System.out.println(Doctor.id);

        Doctor myDoctor1 = new Doctor();
        myDoctor1.showID();
        System.out.println(Doctor.id);

    }
}

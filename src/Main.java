import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Sergio Fernandez Salazar";
        myDoctor.showName();
        myDoctor.showID();

        Doctor myDoctor1 = new Doctor();
        myDoctor1.showID();

        showMenu();
    }
}

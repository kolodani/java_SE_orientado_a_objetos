import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Anahi Salgado", "anahi@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        // for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
        //     System.out.println(aA.getDate() + " " + aA.getTime());
        // }

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        System.out.println(patient);
    }
}
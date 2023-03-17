import java.util.Date;

import model.AppointmentDoctor;
import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Anahi Salgado", "anahi@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Daniel Vinzia", "daniel@mail.com");
        user.showDataUser();

        User user2 = new Patient("Grover Cleveland", "grover@thebest.com");
        user2.showDataUser();

        User user1 = new User("Macarena", "maca@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Rosario\n");
                System.out.println("Departamento: Geriatria\n");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        // for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
        // System.out.println(aA.getDate() + " " + aA.getTime());
        // }

        // Patient patient = new Patient("Alejandra", "alejandra@mail.com");

        // System.out.println(patient);
    }
}
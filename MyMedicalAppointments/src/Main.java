public class Main {
    public static void main(String[] args) {

        // showMenu();

        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
    }
}
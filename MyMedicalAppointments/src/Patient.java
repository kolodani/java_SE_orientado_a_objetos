public class Patient {
    // Atributos
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
        this.weight = 54.5;
        System.out.println(weight + "Kg.");
    }
}

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
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeight() {
        return this.height + " Mts.";
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El numero telefonico debe ser de 8 digitos maximo");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

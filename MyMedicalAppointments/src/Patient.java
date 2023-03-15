public class Patient extends User {
    // Atributos
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    public Patient(String name, String email) {
        super(name, email);
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
}

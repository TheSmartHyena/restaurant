public class Plat {
    private int id = 0;
    private String name = "";
    private String description = "";
    private double prix = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Plat(int id, String name, String description, double prix) {
        this.name = name;
        this.description = description;
        this.prix = prix;
        this.id = id;

    }

    public String toString() {
        return "";
    }
}

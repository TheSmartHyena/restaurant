public class Client {
    private int id = 0;
    private String nom = "";
    private String addresse = "";
    private String telephone = "";

    public Client(int id, String nom, String addresse, String telephone) {
        this.id = id;
        this.nom = nom;
        this.addresse = addresse;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String toString() {
        return "";
    }
}

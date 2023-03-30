import java.util.*;

public class Menu {
    private int id = 0;
    private String nom = "";
    private String description = "";
    private List plats = new ArrayList();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private void ajouterPlat (int idPlat) {

    }
    private void supprimerPlat (int idPlat) {

    }

    public String toString() {
        return "Menu: id" + this.id + " nom: " + this.nom;
    }
}

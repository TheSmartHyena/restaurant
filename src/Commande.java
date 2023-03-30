import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id = 0;
    private int clientId = 0;

    private List<Plat> plats = new ArrayList<Plat>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void ajouterPlat (int idPlat) {

    }

    public void supprimerPlat (int idPlat) {

    }

    public List<Plat> getPlats() {
        return this.plats;
    }

    public String toString() {
        return "";
    }
}

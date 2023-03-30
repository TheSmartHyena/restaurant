import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List clients = new ArrayList<>();
    private List menus = new ArrayList<>();
    private List commandes = new ArrayList<>();

    public void ajouterClient (Client client) {}

    public void supprimerClient(int idClient) {}

    public void ajouterMenu(Menu menu) {}
    public void supprimerMenu() {}

    public void ajouterCommande(Commande commande, int clientId) {}
    public void afficherListeMenus() {}
    public void afficherListeCommandes() {}
    public void afficherListeCommandesClient() {}

    public void afficherPrixCommande() {}

}

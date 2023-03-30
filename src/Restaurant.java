import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Client> clients = new ArrayList<Client>();
    private List<Menu> menus = new ArrayList<Menu>();
    private List<Commande> commandes = new ArrayList<Commande>();

    public void ajouterClient (Client client) {
        clients.add(client);
    }

    public void supprimerClient(int idClient) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == idClient) {
                clients.remove(i);
                break;
            }
        }
    }

    public void ajouterMenu(Menu menu) {
        menus.add(menu);
    }

    private int getIndexMenuId(int menuId) {
        int result = -1;

        for (int i = 0; i < menus.size(); i++) {
            if (menus.get(i).getId() == menuId) {
                result = i;
                break;
            }
        }

        return result;
    }

    public void supprimerMenu(int idMenu) {
        menus.remove(getIndexMenuId(idMenu));
    }

    public void ajouterCommande(Commande commande) {
        commandes.add(commande);
    }

    public void afficherListeMenus() {
        for (Menu item : menus) {
            System.out.println(item.toString());
        }
    }

    public void afficherListeCommandes() {}
    public void afficherListeCommandesClient() {}

    private int getIndexCommande(int commandeId) {
        int result = -1;

        for (int i = 0; i < commandes.size(); i++) {
            if (commandes.get(i).getId() == commandeId) {
                result = i;
                break;
            }
        }

        return result;
    }

    public void afficherPrixCommande(int idCommande) {
        int indexCommande = this.getIndexCommande(idCommande); // On récupère l'index
        Commande commande = commandes.get(indexCommande); // Avec cet index on récupère la commande de la liste des commandes
        double prix = this.getPrixCommande(commande); // Avec cette commande on récupère le prix total

        System.out.println("Le prix de la commande: " + prix); // On l'affiche
    }

    private double getPrixCommande(Commande commande) {
        double total = 0.0;

        for (Plat plat : commande.getPlats()) {
            total += plat.getPrix();
        }

        return total;
    }



    public void afficherPrixCommandes(int clientId) {
        List<Commande> commandesClient = new ArrayList<Commande>();
        for (Commande item : commandes) {
            if (item.getClientId() == clientId) {
                commandesClient.add(item);
            }
        }

        double result = 0.0;
        for (Commande item : commandesClient) {
            result += this.getPrixCommande(item);
        }

        System.out.println("Le prix total est de : " + result);
    }

}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant resto = new Restaurant();

        Client clientA = new Client(0, "Toto", "3 rue des clefs", "4567876");
        Client clientB = new Client(1, "Toto", "3 rue des clefs", "4567876");

        resto.ajouterClient(clientA);
        resto.ajouterClient(clientB);

        Plat platA = new Plat(0, "sefs", "sefsef", 4.0);

        List<Plat> plats = new ArrayList<Plat>();
        plats.add(platA);

        int platATrouver = 0;
        for (int i = 0; i < plats.size(); i++) {
            Plat plat = plats.get(i); // On prends l'élément à l'index i de la liste des plats

            if (platATrouver == plat.getId()) {
                break;
            }
        }

        // Même chose mais sans index, on prends un élément après l'autre
        for (Plat plat : plats) {
            if (platATrouver == plat.getId()) {
                break;
            }
        }

    }
}
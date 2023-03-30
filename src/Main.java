public class Main {
    public static void main(String[] args) {
        Restaurant resto = new Restaurant();

        Client clientA = new Client(0, "Toto", "3 rue des clefs", "4567876");
        Client clientB = new Client(1, "Toto", "3 rue des clefs", "4567876");

        resto.ajouterClient(clientA);
        resto.ajouterClient(clientB);

    }
}
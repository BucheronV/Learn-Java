public class InfiniteHotel {
    public static void main(String[] args) {
        int nombre = 0;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("Bienvenue à l'Hôtel Infini !");
            System.out.println("Jusqu'à quelle chambre souhaitez-vous aller ?");

            int chambreMax = scanner.nextInt();

            if (chambreMax < 1) {
                System.out.println("Le numéro doit être supérieur ou égal à 1.");
                continue;
            }

            while (nombre < chambreMax) {
                nombre++;
                System.out.println("Vous êtes maintenant dans la chambre numéro " + nombre);
            }

            System.out.println("Vous avez visité jusqu'à la chambre " + nombre + ". Vous sortez de l'hôtel indemne ✨");

            System.out.println("Souhaitez-vous visiter plus de chambres ? (oui/non)");
            String reponse = scanner.next();
            if (!reponse.equalsIgnoreCase("oui")) {
                System.out.println("Merci de votre visite à l'Hôtel Infini !");
                break;
            }
        }

        scanner.close();
    }
}

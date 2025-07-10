public class ContainsKeywords {
    public static void main(String[] args) {
        String txt = "Bonjour comment vas-tu ? Tu sais que tu pourrais acheter un saucisson pour l'apéro de malade prévu ce soir !";
        String findWord = "saucisson";

        if (txt.indexOf(findWord) >= 0 ) {
            System.out.println("Mot trouvé");
        } else {
            System.out.println("Mot non trouvé");
        }
    }
}

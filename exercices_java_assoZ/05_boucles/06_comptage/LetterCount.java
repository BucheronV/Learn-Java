public class LetterCount {
    public static void main(String[] args) {
        String txt = "Bonjour comment vas-tu ? Tu sais que tu pourrais acheter un saucisson pour l'apéro de malade prévu ce soir !";
        String findLetter = "o";
        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == findLetter.charAt(0)) {
                count++;
            }
        }
        System.out.println("Le caractère '" + findLetter + "' apparaît " + count + " fois dans le texte.");
    }
}

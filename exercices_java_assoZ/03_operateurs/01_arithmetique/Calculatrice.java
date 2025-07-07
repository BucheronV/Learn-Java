public class Calculatrice {
    public static void main(String[] args) 
    {
        Integer a = 2077;
        Integer b = 1;

        int somme = a + b;
        int soustraction = a - b;
        int multiplication = a * b;
        int division = a / b;

        System.out.println("La somme de " + a + " et " + b + " est égal à " + somme + ".");
        System.out.println("La soustraction de " + a + " et " + b + " est égal à " + soustraction + ".");
        System.out.println("Le multiplication de " + a + " et " + b + " est égal à " + multiplication + ".");
        System.out.println("La division de " + a + " par " + b + " est égal à " + division + ".");
    }
}

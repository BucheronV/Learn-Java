public class OddEvenTernary {
    public static void main(String[] args) {

        Integer nbr = 10;
        String nbrMessage = nbr % 2 == 0 ? "Nombre pair" : "Nombre impair";

        System.out.println(nbrMessage);
    }
}

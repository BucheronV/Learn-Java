public class Soldes {
    public static void main(String[] args) 
    {
        Integer prixInitial = 100;
        Integer pourcentageReduction = 20;

        Integer prixSolde = prixInitial - ((prixInitial* pourcentageReduction)/100);

        System.out.println("Le prix initial est de " + prixInitial + ", le prix après réduction : " + prixSolde);
    }
}

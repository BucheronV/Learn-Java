public class ConditionalDiscount {
    public static void main(String[] args) {
        
        // variables : 
        //produit:
        Integer lait = 3;
        Integer pain = 2;
        Integer confiture = 4;
        Integer total = lait + pain + confiture;
        //variables pour les conditions
        Boolean carteDeReduction = true;
        String[] jour = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};
        String jourChoisi = "mardi";
        Integer meilleureReduction = 90;

        //pour comparer deux string en Java on utilise .equals()
        if (jourChoisi.equals(jour[1])) {
            if (carteDeReduction == true) {
                if (total < 50) {
                    Integer totalAvecReduction = total - ((total * meilleureReduction)/100);
                    System.out.println("Vous bénificiez de la meilleure remise, qui est de -90% sur le payement final. Vous en avez pour " + totalAvecReduction + " euros.");
                } else {
                    System.out.println("Malheureusement vous dépassez la somme de 50 euros, donc vous ne pouvez pas profiter de la meilleure remise du magasin.");
                }
            } else {
                System.out.println("Vous ne possedez pas la carte de réduction pour profiter de la meilleure remise du magasin.");
            }
        } else {
            System.err.println("La grande promotion du magasin n'est valide que le Mardi et non un autre jour.");
        }
    }
}
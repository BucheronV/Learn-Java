public class DrivingLicence {
    public static void main(String[] args) 
    {
        Integer age = 25 ;
        Boolean licence = true;

        if (age >= 18 && licence) {
            System.out.println("Vous êtes en règle.");
        } else if (age >= 18 && !licence) {
            System.out.println("Vous avez l'âge d'avoir le permis malheureusement vous n'avez pas le permis. Veuillez sortir du véhicule.");
        } else if (age < 18 && licence){
            System.out.println("Euh, sortez du véhicule !");
        } else {
            System.out.println("Sortez du véhicule !");
        }
    }
}

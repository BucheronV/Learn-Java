public class AccesAdmin {
    public static void main(String[] args) {
        Integer age = 15;
        Boolean isAdmin = true;

        if (age >= 18) {
            System.out.println("Vous avez bien au dessus de 12 ans.");
        } else {
            System.out.println("Aye, vous avez moins de 12 ans.");
        }

        if (isAdmin) {
            System.out.println("Vous êtes admin");
        } else {
            System.out.println("Vous n'êtes pas admin");
        }
    }
}

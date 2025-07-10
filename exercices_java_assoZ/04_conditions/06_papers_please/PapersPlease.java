import java.util.Scanner;

public class PapersPlease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer age;

        System.out.print("Entrez votre âge : ");
        age = scanner.nextInt();

        scanner.close();

        if (age < 18) {
            System.out.println("Vous n'êtes pas majeur.");
        } else {
            System.out.println("Vous êtes majeur.");
        }
    }
}

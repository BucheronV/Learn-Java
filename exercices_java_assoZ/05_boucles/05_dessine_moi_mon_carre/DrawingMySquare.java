import java.util.Scanner;

public class DrawingMySquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choisissez votre taille du carré : ");
        Integer size = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < size; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < size - 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < size - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < size; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

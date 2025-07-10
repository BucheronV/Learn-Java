public class DrawingSquare {
    public static void main(String[] args) {
        Integer size = 5;

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

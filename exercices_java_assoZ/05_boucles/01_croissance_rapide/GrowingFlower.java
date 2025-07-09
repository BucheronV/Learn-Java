public class GrowingFlower {
    public static void main(String[] args) {
        Integer flowerAge = 0;

        while (flowerAge <= 120) {
            if (flowerAge % 7 == 0) {
                System.out.println("La fleur a grandi une semaine de plus");
            }
            if (flowerAge == 120) {
                System.out.println("La fleur a atteint le 120 ème jour de sa croissance");
                break;
            }
            flowerAge ++;
        }
    }
}

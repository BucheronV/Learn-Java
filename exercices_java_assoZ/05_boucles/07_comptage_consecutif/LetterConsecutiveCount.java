public class LetterConsecutiveCount {
    public static void main(String[] args) {
        String input = "Aaoo eeii uuuoaa eee iii ooa uuuaae ooo iiiaa uuoo eeaaoo uuua. Eeeaa uuooa iiiuuu oooaa eeeo uuiaa ooee uuuaa ooii eeeuuu aaoi. Iiuu ooeeaa uuaaee ooo iiaa uuoouu eeeaa iiiuu oooee uuuaa eeeoo. Aaooii eeeuuu oooaa iiuuoo eeaa uuooee iiiaa oouu eeeaaa uuuooii.";
        char findLetter = 'o';
        int consecutiveCount = 0;
        int maxConsecutive = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == findLetter) {
                consecutiveCount++;
            } else {
                if (consecutiveCount > 0) {
                    System.out.println("Le caractère '" + findLetter + "' apparaît " + consecutiveCount + " fois consécutivement.");
                    if (consecutiveCount > maxConsecutive) {
                        maxConsecutive = consecutiveCount;
                    }
                    consecutiveCount = 0;
                }
            }
        }

        if (consecutiveCount > 0) {
            System.out.println("Le caractère '" + findLetter + "' apparaît " + consecutiveCount + " fois consécutivement.");
            if (consecutiveCount > maxConsecutive) {
                maxConsecutive = consecutiveCount;
            }
        }

        System.out.println("Le nombre maximum de '" + findLetter + "' consécutifs est : " + maxConsecutive + ".");
    }
}

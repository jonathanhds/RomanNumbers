import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

    private static Map<Character, Integer> table = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    private String value;

    public RomanNumber(String value) {
        this.value = value;
    }

    public int toInteger() {
        int result = 0;
        int rightLetterValue = 0;

        for (int i = value.length() - 1; i >= 0; i--) {
            char letter = value.charAt(i);
            int letterValue = table.get(letter);
            int multiplier = 1;

            if (letterValue < rightLetterValue) {
                multiplier = -1;
            }

            result += letterValue * multiplier;
            rightLetterValue = letterValue;
        }

        return result;
    }

}

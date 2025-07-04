import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) return 0;

        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int current = romanMap.getOrDefault(currentChar, -1);

            if (current == -1) {
                throw new IllegalArgumentException("Invalid Roman numeral: " + currentChar);
            }

            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }

            prev = current;
        }

        return total;
    }
}

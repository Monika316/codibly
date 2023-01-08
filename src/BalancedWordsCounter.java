import java.util.HashMap;

public class BalancedWordsCounter {
    public static int count(String input) {
        if (input == null) {
            throw new RuntimeException("Input string cannot be null");
        }
        // Check for non-letter characters
        if (!input.matches("^[a-zA-Z]*$")) {
            throw new RuntimeException("Input string can only contain letters");
        }

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                String subword = input.substring(i, j);
                if (isBalanced(subword)) {
                    count++;
                }
            }
        }
        return count;
    }
    private static boolean isBalanced(String word) {
        // Check for empty string
        if (word.isEmpty()) {
            return false;
        }
        // Count the frequency of each letter
        HashMap<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }
        // Check if all letter frequencies are equal
        int firstCount = -1;
        for (int count : counts.values()) {
            if (firstCount == -1) {
                firstCount = count;
            } else if (count != firstCount) {
                return false;
            }
        }
        return true;
    }
}
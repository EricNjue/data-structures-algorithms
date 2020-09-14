import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {

    public char findFirstNonRepeatingChar(String input) {
        Map<Character, Integer> map = new HashMap<>();

        char[] data = input.toCharArray();
        for (char ch : data) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (char item : data) {
            if (map.get(item) == 1)
                return item;
        }

        return Character.MIN_VALUE;
    }

    public char findFirstRepeatedChar(String input) {
        Set<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}

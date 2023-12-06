import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharsInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        Map<Character, Integer> result = new LinkedHashMap<>();

        for (String word : text) {
            for (Character ch : word.toCharArray()) {
                if (!result.containsKey(ch)) {
                    result.put(ch, 1);
                } else {
                    Integer value = result.get(ch);
                    result.put(ch, value + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> res : result.entrySet()) {
            System.out.printf("%c -> %d%n", res.getKey(), res.getValue());
        }
    }
}

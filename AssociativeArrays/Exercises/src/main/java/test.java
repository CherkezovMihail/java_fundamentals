import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> result = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }

            if (!result.containsKey(symbol)) {
                result.put(symbol, 1);
            } else {
                Integer value = result.get(symbol);
                result.put(symbol, value + 1);
            }
        }
        for (Map.Entry<Character, Integer> res : result.entrySet()) {
            System.out.printf("%c -> %d%n", res.getKey(), res.getValue());
        }
    }
}


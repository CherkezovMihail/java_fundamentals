import java.lang.reflect.Array;
import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());



        Map<String, List<String>> words = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonyms = scanner.nextLine();

            if (!words.containsKey(word)) {
                words.put(word, new ArrayList<>());
                words.get(word).add(synonyms);
            }else {
                words.get(word).add(synonyms);
            }
        }

        for (Map.Entry<String, List<String>> result: words.entrySet()) {
            String print = result.getKey() + " - " + String.join(", ", result.getValue());
            System.out.println(print);
        }
    }
}

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().toLowerCase().split(" ");

        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        for (String currentWord : words) {
            if (!wordsCount.containsKey(currentWord)) {
                wordsCount.put(currentWord, 1);
            }else {
                Integer value = wordsCount.get(currentWord);
                wordsCount.put(currentWord, value + 1);
            }
        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> v : wordsCount.entrySet()) {
            if (v.getValue() % 2 == 1) {
                result.add(v.getKey());
            }
        }

        System.out.println(String.join(", ", result));
    }
}

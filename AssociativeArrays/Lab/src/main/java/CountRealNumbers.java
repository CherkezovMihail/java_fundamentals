import org.example.Main;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> numbersCount = new TreeMap<>();

        for (double num: numbers) {
            if (!numbersCount.containsKey(num)) {
                numbersCount.put(num, 1);
            }else {
                Integer value = numbersCount.get(num);
                numbersCount.put(num, value + 1);
            }
        }

        for (Map.Entry<Double, Integer> currentMap: numbersCount.entrySet()) {
            System.out.printf("%.0f -> %d%n", currentMap.getKey(), currentMap.getValue());
        }
    }
}

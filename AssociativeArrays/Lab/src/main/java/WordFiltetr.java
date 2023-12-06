import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFiltetr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                        .filter(w -> w.length() % 2 ==0)
                        .toArray(String[]::new);

        System.out.printf(String.join("%n", words));

    }
}

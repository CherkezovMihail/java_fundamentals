import java.util.Arrays;
import java.util.Scanner;

public class Articles {

    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void ToString() {
            System.out.printf("%s - %s: %s%n", this.title, this.content, this.author);
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputArticle = scanner.nextLine().split(", ");

            Article currentArticle = new Article(inputArticle[0], inputArticle[1], inputArticle[2]);

            currentArticle.ToString();
        }

    }
}

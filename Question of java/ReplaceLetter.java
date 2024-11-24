//WAP replace the one word with other word in the file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReplaceLetter {
    public static void main(String... args) {
        File file = new File("abc.txt");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    if (word.equalsIgnoreCase("vibrant")) {
                        line = line.replace(word, "bright"); // Replace 'vibrant' with 'bright'
                    }
                }
                System.out.println(line); // Print the modified line
            }
            System.out.println("The Replacement successfully in the file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
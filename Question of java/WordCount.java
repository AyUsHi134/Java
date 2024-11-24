//WAP to find the word count in a text file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class WordCount {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        int wordcount=0;
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String line;
            while((line=reader.readLine())!=null){
                StringTokenizer tokenizer=new StringTokenizer(line);
                wordcount +=tokenizer.countTokens();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(wordcount);
    }
}

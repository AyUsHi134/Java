//WAP to find the occurance of a given word in a text file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class WordOccuranceCounter {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        String targetWord="viswa";
        int wordcount=0;

        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String line;
            while ((line=reader.readLine())!=null){
                StringTokenizer tokenizer=new StringTokenizer(line);
                while(tokenizer.hasMoreTokens()){
                    String word=tokenizer.nextToken();
                    if(word.equalsIgnoreCase(targetWord)){
                        wordcount++;
                    }
                }
            }
         } catch(IOException e){
                System.out.println(e.getMessage());
                return;
            }
            System.out.println("The occourence of a target word in a file is:  "+wordcount);
        }
    }

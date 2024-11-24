//WAP to find the lenghty line in a text file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class LongestLineFinder {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        String longestline="";
        int maxlength=0;
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String line;
            while((line=reader.readLine())!=null){
                if(line.length()>maxlength){
                    maxlength=line.length();
                    longestline=line;
                }
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("In a file longest line is"+longestline+"  line length is"+" "+maxlength);
    }
}

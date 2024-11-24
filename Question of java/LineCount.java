/// WAP to  ind the number of lines present in a text file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class LineCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        File file=new File("abc.txt");
        int linecount=0;
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String line;
            while((line=reader.readLine())!=null){
                linecount++;
            }
        }catch(IOException e){
                System.out.println(e.getMessage());
                return;
            }
        
        System.out.println("Line count in the file is: "+linecount);
    }
}

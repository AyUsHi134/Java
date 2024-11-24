//WAP to merge two text files data into a new singel text file
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerger {
    public static void main(String[] args) {
        File file1=new File("abc.txt");
        File file2=new File("xyz.txt");
        File mergedfile=new File("merge.txt");

        try(BufferedReader reader1=new BufferedReader(new FileReader(file1));
        BufferedReader reader2=new BufferedReader(new FileReader(file2));
        BufferedWriter writer=new BufferedWriter(new FileWriter(mergedfile))){
            String line;
            while((line=reader1.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }
            while((line=reader2.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File merged successfully "+mergedfile.getName());
        }catch(IOException e){
            System.out.println(e.getMessage());
            return;
        }
    }
}

//WAP in this code special char are replace with out chars in file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        File file=new File("xyz.txt");

        /*try(BufferedWriter writer=new BufferedWriter(new FileWriter(file))){
            for(int i=0;i<str.length();i++){
                char currentChar = str.charAt(i);
                if (currentChar == '!' || currentChar == '@' || currentChar == '#' || currentChar == '$' || currentChar == '%' || currentChar == '&' || currentChar == '*') {
                    writer.write('+');
                }else {
                    writer.write(currentChar);
                }
            }
            writer.close();
            System.out.println("Special characters replaced and saved in output.txt");
        }catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }*/

        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            String line;
            while((line=reader.readLine())!=null){
                String abc=line.replaceAll("[^a-zA-z0-9]", "");
            System.out.println(abc);
            }
        }catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        }
    }


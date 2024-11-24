//In a given string remove vowels and print consonants in given string
import java.util.Scanner;
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        String a=b.toLowerCase();

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'|| a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                }
            else{
                System.out.print(a.charAt(i));
            }
        }
    }
}

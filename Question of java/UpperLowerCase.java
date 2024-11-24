//Given String convert into UpperCase or LowerCase
import java.util.Scanner;
public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String UpperCase=str.toUpperCase();
        String LowerCase=str.toLowerCase();
        System.out.println("UpperCase : "+UpperCase);
        System.out.println("LowerCase : "+LowerCase);
    }
}

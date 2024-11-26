
import java.util.Scanner;

public class DriverLicense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter course is completed or not");
        boolean courseComplete = scanner.nextBoolean();
        
        if(age >=16 && courseComplete){
            System.out.println("Eligible for driving");    
        } else{
            System.out.println("Not eligible for driving");

        }

        System.out.println("Enter a character");
        char ch = scanner.next().charAt(0);
        if((ch >= 'b' &&  ch <= 'z') || (ch >= 'B' && ch <= 'Z')){
            System.out.println("The preceding alphabet is:" + (char)(ch-1));
        } else{
            System.out.println("The alphabet does not lie in range");
        }

        
     }
}

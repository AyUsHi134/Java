import java.util.Scanner;

public class VotersAge {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        if(age >=18){
            System.out.println("Can vote");
        } else {
            System.out.println("cannot vote");
        }

    }
}

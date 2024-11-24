import java.util.Scanner;
public class Magicnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int SumOfDigits=0;
        int ProductOfDigits=1;
        int OrginalNumber=num;
        while(num>0){
            int digit=num%10;
            SumOfDigits +=digit;
            ProductOfDigits *=digit;
            num=num/10;
        }
        if(SumOfDigits == ProductOfDigits){
            System.out.println(OrginalNumber+"is a Magic Number");
        }else{
            System.out.println(OrginalNumber+"is not a Magic number");
        }
    }
}

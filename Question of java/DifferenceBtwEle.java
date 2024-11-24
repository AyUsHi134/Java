//mutiplication first element of array and last element in array
import java.util.Scanner;
public class DifferenceBtwEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int multiply=arr[0]*arr[size-1];
        System.out.println("Multiplication of array first ele and last element: "+multiply);
    }
}

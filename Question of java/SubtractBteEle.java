//Difference between first element and last element in array
import java.util.Scanner;
public class SubtractBteEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int abc=arr[0]-arr[size-1];
        System.out.println(abc);
    }
}

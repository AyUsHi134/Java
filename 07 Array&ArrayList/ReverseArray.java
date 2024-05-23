import java.util.Arrays;

public class ReverseArray {
    
    public int[] reverseArray(int[] array) {
        if(array.length < 1 ) {
            return array;
        }

        int start = 0;
        int end = array.length -1;

        int[] reversedArray = new int[array.length];

        while(start <= end){
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
            start++;
            end--;

        }

        return reversedArray;
    }

    public static void main(String[] args) {
        ReverseArray reverse = new ReverseArray();
        System.out.println(Arrays.toString(reverse.reverseArray(new int[]{1,2,3,4,5})));
    }
}

public class SortArray {
    
    public boolean isSorted(int[] array) {
        if(array.length <= 1) {
            return true;
        }

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i + 1] < array[i]) {
                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {
        SortArray sorted = new SortArray();
        System.out.println(sorted.isSorted(new int[] {1,5,3,6}));
        
    }
}

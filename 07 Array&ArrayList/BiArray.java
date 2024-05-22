public class BiArray {
    
    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);

        return sum1 == sum2;
    }

    private int calculateSum(int[] array) {
        int sum = 0;
        for(int element: array) {
            sum += element;
        }
        return sum;

    }

    public static void main(String[] args) {
        BiArray number = new BiArray(new int[] {9,5,7}, new int[] {19,1,1});
        System.out.println(number.areSumsEqual());
        System.out.println(number.calculateSum(new int[] {5,6,3}));

        
    }


}

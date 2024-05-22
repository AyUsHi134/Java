public class FilterElement {

    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        
        for(int value: array){
            if(value > number){
                return true;
            }
        }

        return false;

    }

    public int findSecondLargestElement(int[] array) {

        if(array.length == 0) {
            return -1;
        }

        int largestElement = Integer.MIN_VALUE;

        int secondLargestElement = Integer.MIN_VALUE;


        for(int value: array) {
            if(value > largestElement) {
                secondLargestElement = largestElement;
                largestElement = value;
            } else if (value > secondLargestElement && value != largestElement) {
                secondLargestElement = value;
                
            }

        }

        if(secondLargestElement == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargestElement;

    }



    public static void main(String[] args) {
        FilterElement greatest = new FilterElement();
        System.out.println(greatest.doesHaveElementGreaterThan(new int[]{1,2,3,4,5}, 3));
        System.out.println(greatest.findSecondLargestElement(new int[]{4,4,5,7,9}));


        

    }
}
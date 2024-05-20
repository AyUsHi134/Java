import java.math.BigDecimal;
import java.math.RoundingMode;

public class Result {

    @SuppressWarnings("unused")
    private String name;
    private int[] marks;

    public Result(String name, int... marks){//variable argument 
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {

        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark: marks){
            sum += mark;
        }

        return sum;

    }

    public int getMaximumMark() {

        int maximum = Integer.MIN_VALUE;
        for(int mark: marks){ // 94,98,10
            if(mark>maximum){ //marks is 94 & maximum is 0 at first
                maximum = mark;
            }
        }

        return maximum;

    }

    public int getMinimumMark() {
    
        int minimum = Integer.MAX_VALUE;
        for(int mark: marks){
            if(mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;

    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public static void main(String[] args) {
        
        Result student = new Result("Ranga", 97,98,100);
        System.out.println("number of Marks : " + student.getNumberOfMarks());
        System.out.println("Total sum : " + student.getTotalSumOfMarks());
        System.out.println("Maximum marks: " + student.getMaximumMark());
        System.out.println("Minimum marks : " + student.getMinimumMark());
        System.out.println("Average : " + student.getAverageMarks());

    }
     
}

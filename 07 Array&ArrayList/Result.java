import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Result {

    @SuppressWarnings("unused")
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Result(String name, int... marks){//variable argument 
        this.name = name;
        
        for(int mark: marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {

        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark: marks){
            sum += mark;
        }

        return sum;

    }

    public int getMaximumMark() {

       return Collections.max(marks);

    }

    public int getMinimumMark() {
    
        return Collections.min(marks);


    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public String toString() {
        return name + marks;
    }
    
    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }

    public static void main(String[] args) {
        
        Result student = new Result("Ranga", 97,98,100);
        System.out.println("number of Marks : " + student.getNumberOfMarks());
        System.out.println("Total sum : " + student.getTotalSumOfMarks());
        System.out.println("Maximum marks: " + student.getMaximumMark());
        System.out.println("Minimum marks : " + student.getMinimumMark());
        System.out.println("Average : " + student.getAverageMarks());
        student.addNewMark(35); // void methods //cannot use println
        System.out.println(student);
        student.removeMarkAtIndex(2);
        System.out.println(student);
    }

   
     
}

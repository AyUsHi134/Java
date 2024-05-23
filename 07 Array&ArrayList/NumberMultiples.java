import java.util.ArrayList;
import java.util.List;

public class NumberMultiples {

    public List<Integer> determineMultiples(int number, int limit) {

        List<Integer> multiples = new ArrayList<Integer>();

        if(number <= 0  || limit <= 0) {
            return multiples;
        }

        for(int i =1; number * i <= limit; i++) {
            multiples.add(number * i);
        }

        return multiples;
        
    }
    
    public static void main(String[] args) {
        NumberMultiples multiple = new NumberMultiples();
        System.out.println(multiple.determineMultiples(3, 30).toString());
        
    }
}

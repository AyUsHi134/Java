import java.util.List;
import java.util.ArrayList;


public class FactorsList {

    public List<Integer> determineAllFactors(int number) {

        List<Integer> factors = new ArrayList<>();
 
        if(number <= 0) {
            return new ArrayList<>();
        }

        for(int i = 1; i<= number;i++) {
            if(number%i == 0) {
                factors.add(i);
            }
        }

        return factors; 

    }

    public static void main(String[] args) {
        FactorsList list = new FactorsList();
        System.out.println(list.determineAllFactors(6).toString());
        
    }
    
}

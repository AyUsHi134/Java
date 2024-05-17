public class BiNumbers {
    
    private int number1;
    private int number2;

    

    public BiNumbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    
    public int getNumber1() {
        return number1;
    }
    
    public int getNumber2() {
        return number2;
    }

    public int calculateLCM() {
        
        if(number1 < 0 || number2 < 0){
            return -1;
        }

        if(number1 == 0 || number2 == 0){
            return 0;
        }

        int max = Math.max(number1, number2);
        int lcm = max;//8

        while(true) {
            boolean isFinalLcm = lcm%number1 == 0 && lcm%number2 == 0;
            if (isFinalLcm) {
                return lcm; 
            }
            

            lcm += max;//incrementing lcm by max no 8+8+8
        }
    }

    public int calculateGCD() {

        if(number1 < 0 || number2 < 0){
                return 1;
            }
    
        if(number1 == 0 || number2 == 0){
                return 0;
            }

        if(number1 == number2) {
                return number1;
            }

        int min = Math.min(number1, number2);
        for(int i = min; i > 0; i--) {
        boolean isDivisorOfBothNumbers = number1 % i == 0 && number2 % i ==0;
        if (isDivisorOfBothNumbers) {
            return i;
        }
        }
            return -1;
            

        }

    
    public static void main(String args[]) {
        BiNumbers number = new BiNumbers(48, 18);
        System.out.println(number.calculateLCM());
        System.out.println(number.calculateGCD());

    }
}

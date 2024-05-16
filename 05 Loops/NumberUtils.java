public class NumberUtils {

    public int getLastDigit(int number){
        if(number < 0) {
            return -1;
        }

        return number % 10;//logic to find last digit is just div by 10
    }  
    

    public int getNumberOfDigits(int number) {
        if(number < 0) {
            return 1;
        }

        if(number == 0) {
            return 1;
        }

        //12345 > 1234 > 123 > 12 > 1 > 0
        int noOfDigits = 0; //temp variable
        while(number > 0) {
            number = number / 10;
            noOfDigits++; 
        }
        
        return noOfDigits;
        
    }

    public int getSumOfDigits(int number) {

        if(number < 0){
            return -1;
        }

        if(number == 0) {
            return 0;
        }

        // 1234 % 10 = 4, 123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1
        //LOOP
           // mod 10 to calculate remainder(ex 4,3)
           // div 10 to calculate remaining digits
        int sumOfDigits = 0;
        while (number > 0) {
        int digit = number % 10;//4,3,2,1
        sumOfDigits += digit;//4,7,9,10
        number = number/10;//123,12,1,0   
        }
        
        return sumOfDigits; 
    }

    public static void main(String[] args) {
        NumberUtils utils = new NumberUtils();
        System.out.println(utils.getLastDigit(2598));
        System.out.println(utils.getNumberOfDigits(576));
        System.out.println(utils.getSumOfDigits(1234));
    }
    
}

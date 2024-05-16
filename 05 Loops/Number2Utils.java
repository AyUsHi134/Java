public class Number2Utils {

    public int reverseNumber(int number) {
        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 0;
        } 

        //456
        //mod 10, div 10
        //6, 45
        //5, 4
        // 4, 0
        //654

        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number/10;
            System.out.format("digit-%d number-%d reversedNumber-%d", digit, number,reversedNumber).println();
        }

        return reversedNumber;


    }
    public static void main(String[] args) {
        Number2Utils utils = new Number2Utils();
        System.out.println(utils.reverseNumber(67543));

        
    }
}

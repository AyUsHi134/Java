public class RightMostDigit {

    public int getRightmostDigit(String str) {
            if (str==null || str.equals("")) {
            return -1;
            }

            int length = str.length();

            for(int i = length-1; i>=0; i--) {
                char ch =  str.charAt(i);

                if(Character.isDigit(ch)) {
                    return Character.getNumericValue(ch);
                }
            }

            return -1;
        
    }

    public static void main(String[] args) {
            RightMostDigit digit =  new RightMostDigit();
            System.out.println(digit.getRightmostDigit("I bought 5 apples, 4 bananas, and 9 oranges"));
    }
    
}

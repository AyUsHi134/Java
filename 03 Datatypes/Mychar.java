public class Mychar {

    private char ch;

    public Mychar(char ch) {
        this.ch = ch;
    }
    private boolean isVowel() {
        if ( ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

              return true;
               }
        return false;
    }
    
    private boolean isDigit() {
          if(ch >= 48 && ch <= 57) //between 0 and 9
        {
          return true;
        }

        return false;
        
    }
    
    private boolean isAlphabet() {
        if (ch >= 97 && ch <= 122)
        {
            return true;
        }

        if (ch >= 65 && ch <= 90)
        {
            return true;
        }

        return false;
    } 

    private boolean isConsonant() {
        if (isAlphabet() && !isVowel()) 
        {
            return true;
        }
        return false;
    }
    
    private static void printUpperCaseAlphabets() {
        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.println(ch);
        }

    }
    
    private static void printLowerCaseAlphabets() {
        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        Mychar mychar = new Mychar('A');
        System.out.println(mychar.isVowel()); // prints aeiou and capitals.
        System.out.println(mychar.isDigit());
        System.out.println(mychar.isAlphabet());
        System.out.println(mychar.isConsonant());
        Mychar.printLowerCaseAlphabets(); //static methods 
        Mychar.printUpperCaseAlphabets(); //not using data from class
    }
   
}

    

    

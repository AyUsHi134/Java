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
          if(ch >= 48 && c>)

          return true;
        
    }

    public static void main(String[] args) {
        Mychar mychar = new Mychar('i');
        System.out.println(mychar.isVowel()); // prints aeiou and capitals.
        System.out.println(mychar.isDigit());
       // System.out.println(mychar.isAlphabet());
       // Mychar.printLowerCaseAlphabets();
       // Mychar.printUpperCaseAlphabets();
    }
}

    

    

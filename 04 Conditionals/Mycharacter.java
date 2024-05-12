public class Mycharacter {
    
    public boolean isVowel(char ch) {
        switch(ch) {
            case 'a', 'e', 'i', 'o', 'u' :
            case 'A', 'E', 'I', 'O', 'U' : return true;
            default: return false;
        }
    }

    public static void main(String args[]) {
        Mycharacter vowel = new Mycharacter();
        System.out.println(vowel.isVowel('F'));
    }
    
}

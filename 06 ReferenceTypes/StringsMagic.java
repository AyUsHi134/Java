public class StringsMagic {

public boolean hasConsecutiveDuplicates(String str) {

    if(str == null) {
        return false;
    }

    for(int i = 0; i < str.length()-1;i++) {
        char currentCharacter = str.charAt(i);
        char nextCharacter = str.charAt(i+1);

        if(currentCharacter == nextCharacter) {
            return true;
        }
    }

    return false;

}
    

public static void main(String[] args) {
    StringsMagic wordStringsMagic = new StringsMagic();
    System.out.println(wordStringsMagic.hasConsecutiveDuplicates(""));
    
}
}
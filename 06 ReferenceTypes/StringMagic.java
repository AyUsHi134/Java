public class StringMagic {

    public int countUppercaseLetters(String str) {
        if(str == null){
            return -1;
        } 

        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)));{
            count++;

            }
    }

        return count;


    }
    public static void main(String[] args) {
        StringMagic wordStringMagic = new StringMagic();
        System.out.print(wordStringMagic.countUppercaseLetters("hello world"));

    }
}
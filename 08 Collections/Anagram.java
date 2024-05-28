import java.util.Arrays;

public class Anagram {
    
    public boolean areAnagrams(String str1, String str2){
        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        String lowercaseStr1 = str1.toLowerCase();
        String lowercaseStr2 = str2.toLowerCase();

        char[] charArray1 = lowercaseStr1.toCharArray();
        char[] charArray2 = lowercaseStr2.toCharArray();

        Arrays.sort(charArray1); 
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);

 }
}

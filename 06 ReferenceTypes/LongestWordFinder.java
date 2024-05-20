public class LongestWordFinder {

    public String findLongestWord(String sentence) {

        if(sentence==null ||
            sentence.equals("")) {
                return "";
            }

        String[] words = sentence.split(" ");
        
        int maxLength = 0;
        String longestWord = "";

        for(String word: words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        LongestWordFinder find = new LongestWordFinder();
        System.out.println(find.findLongestWord("Java is an Oject oriented Programming language"));
    }
    
    
}

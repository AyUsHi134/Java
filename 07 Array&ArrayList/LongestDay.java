public class LongestDay {
    
    public static void main(String args[]) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday"};

        String dayWithMostCharacters = "";
        for(String day: daysOfWeek){
            if(day.length() > dayWithMostCharacters.length()) {
                dayWithMostCharacters = day;
            }
        }

        System.out.println("Day with most number of Characters " + dayWithMostCharacters);

        for(int i= daysOfWeek.length-1; i>=0; i--){
            System.out.println(daysOfWeek[i]);
        }
    }
}

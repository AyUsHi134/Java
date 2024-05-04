public class Dimension {

        private int feet;
        private int inches;
    
        public Dimension(int inches){ 
           if(inches < 0) {
            this.feet = -1;
            this.inches = -1;
           } else{
            this.feet = inches/12;
            this.inches = inches % 12;
           }
           //25 inches
           //12 inches = 1 foot
           //25 = 2foot + 1inche
        }
    
        public int getFeet(){
          // returning 2foot
            return feet;
        }
    
        public int getInches(){
           // returning 1 inche
            return inches;
        }
    
        public static void main(String args[]){
          Dimension dimensions = new Dimension(12);
          System.out.println(dimensions.getFeet());
          System.out.println(dimensions.getInches());

        }
    
}
    


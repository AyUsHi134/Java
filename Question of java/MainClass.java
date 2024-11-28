public class MainClass {
     public static void main(String[] args) {
        
        //Encapsulation
        /*Rectangle rect1 = new Rectangle(); //object created // also since constructor is missing here a default const. is created which exists without definition// since we gave the constructor we cannot create object like this
        rect1.length = 4; // value assigning to both
        rect1.breadth = 5;*/
        
        //constructor
         Rectangle rect1 = new Rectangle(4,5);// creating object after constructor given
        rect1.draw();// calling the method or running them
        rect1.Area();

        Circle circle = new Circle(5);
        circle.draw();
        circle.Area();

    }
}




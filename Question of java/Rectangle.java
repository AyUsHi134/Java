public class Rectangle {
    public int length;
    public int breadth;
  
    public Rectangle(int length, int breadth){// constructor
     System.out.println("I am inside constructor");
     this.length = length; // calling instance variable 
     this.breadth = breadth;
    }
  public void draw(){
    System.out.println("Drawing a rectangle");
  

  }

  public void Area(){
    System.out.println("Area is: "+ (length*breadth ));
  }
}
 
 


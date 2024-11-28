abstract class Shape {
    protected String name;

    public Shape() { //superclass Constructor
        this.name = name;
    }

    // public abstract double calculateArea();

    public Shape() {
        //TODO Auto-generated constructor stub
    }

    public void displayInfo() {
        System.out.println("Shape:" + name);
        System.out.println("Area:" + calculateArea());
    }
}

//class Circle extends Shape{
   
    //private double radius;

  //  public Circle(double radius){
//super (name);// call superclass with name
        this.radius = radius;
   // }

    //public Circle(int radius2) {
        //TODO Auto-generated constructor stub
      //}

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }

    public void Area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Area'");
    }
}

class Rectangles extends Shape{
   
    private double length;
    private double width;



    public Rectangles(String name, double length, double width){
        super (name);// call superclass with name
        this.length = length;
        this.width = width;

    }

    public double calculateArea() {
        return length * width;
    }
}

public class ShapeAndArea {
    public static void main(String[] args) {
        //Shape circle = new Circle("Circle", 5.0);
        Shape rectangle = new Rectangles("Rectangles", 4.0, 6.0);

        //circle.displayInfo();
        rectangle.displayInfo();
        
    }
    
}

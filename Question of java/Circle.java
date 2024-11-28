public class Circle extends Shape {
   
    private int radius;
    private static final double PI = 3.14;
    

    public Circle (int radius){
        super(); 
        this.radius= radius;
        System.out.println("I am inside constructor of Circle");
    }

    public void Area(){
        System.out.println("Area is: "+ (PI * radius * radius));
      }


    public void draw(){
        System.out.println("Drawing a Circle");
      
    
    }

    

    
    
    }


public class RectShape {

    //state
    private int length;
    private int width;

    //creation
    public RectShape(int length, int width) {
        this.length = length;
        this.width = width;
    }
 
    //operations
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return length*width;
    }

    public int perimeter() {
        return 2 * (length+width);
    }
    
    public String toString() {
        return String.format("length - %d, width - %d, area - %d, perimeter - %d", length,width,area(),perimeter());
        
    }

    public static void main(String[] args) {
        RectShape rectangle = new RectShape(12,16);
        System.out.println(rectangle.toString());
        rectangle.setLength(25);
        rectangle.setWidth(15);
        System.out.println(rectangle.toString());

        

        
    }

    
}

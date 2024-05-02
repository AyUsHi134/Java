public class Point {
    private int x;

    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public void move(int dx, int dy){
          this.x = this.x + dx;
          this.y = this.y + dy;
    }

    public double distanceTo(Point other){
        int diffX = this.x - other.x;
        int diffY = this.y - other.y;
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    public static void main(String[] args) {
        Point line = new Point(3, 4);
        System.out.println(line.distanceTo(line));
    }

   

    

    
    
}

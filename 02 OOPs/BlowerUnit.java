public class BlowerUnit {

    //state


    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;
 

    //creation
    public BlowerUnit(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    //print the state
    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d ", make, radius, color, isOn, speed);
    }

    //behaviour 
    public void SwitchOn(){
        this.isOn = true;
    }

    public void SwitchOff() {
        this.isOn = false;
        setSpeed((byte)0);// by default its int so typecasting 
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }

    public static void main(String[] args) {
        BlowerUnit fan = new BlowerUnit("Manufactor 1", 0.34567,"Green");
        fan.SwitchOn();
        fan.setSpeed((byte)5);
        System.out.println(fan.toString());
        fan.SwitchOff();
        System.out.println(fan.toString());



        
    }
}

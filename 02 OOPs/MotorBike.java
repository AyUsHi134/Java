public class MotorBike {
	// state
	private int speed; // instance/member variable // state of the class // specific to an object
    
	MotorBike(){ // no argument constructor
		
		//this.speed = 5; // one way to assign default value to object 
        this(5); // calling another motorbike constructor
	}


    MotorBike(int speed ){ //constructor 
		this.speed = speed;


	}

	



	public int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) { // local variable
		if(speed > 0)
		this.speed = speed; 
		
		// System.out.println(speed); //local variable is printed
		// System.out.println(this.speed);// value of instance variable 
	}

	public void increaseSpeed(int howMuch){
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch){
		setSpeed(this.speed - howMuch);
	} 
	
 
	void start() { // behavior of the class
		System.out.println("start bikes");
	}

	public static void main(String args[]) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
        MotorBike somethingElse = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());

		ducati.start(); 
		honda.start();

		// motorbike.speed; wrong way of calling an instance object
		// ducati.setSpeed(100);// calling an instance variable  
		
      
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		
		ducati.decreaseSpeed(250);
		honda.decreaseSpeed(250);
		
		//honda.setSpeed(80);// changing state of the object

		

		//ducati.setSpeed(20); // state can be changed across the execution of code
		// honda.setSpeed(60); // changing speed of both the objects


		
	}


	

	
} 
public class MotorBike {
	// state
	private int speed; // instance/member variable // state of the class // specific to an object

	void setSpeed(int speed) { // local variable
		this.speed = speed; //
		// System.out.println(speed); //local variable is printed
		// System.out.println(this.speed);
	}

	void start() { // behavior of the class
		System.out.println("start bike");
	}

	public static void main(String args[]) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		// motorbike.speed; wrong way of calling an instance object
		ducati.speed = 100; // calling an instance variable
		honda.speed = 200; // changing state of the object

		ducati.speed = 20; // state can be changed across the execution of code
		honda.speed = 0; // changing speed of both the objects

	}
}
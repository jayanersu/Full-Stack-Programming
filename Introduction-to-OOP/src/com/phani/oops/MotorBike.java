package com.phani.oops;

public class MotorBike {
	// state/Data
	private int speed;// member variable

	// Action/Behaviour/methods
	void setSpeed(int speed) {// local variable
		if (speed > 0) {
			this.speed = speed;
		} else {
			System.out.println("Incorrect speed");
		}
//		System.out.println(speed); // -> points to local variable
//		System.out.println(this.speed);// -> member variable
	}

	int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed = this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed = this.speed - howMuch);
	}

	void start() {
		System.out.println("start bike");
	}

}

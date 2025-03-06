package com.phani.oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike passionplus = new MotorBike();
		MotorBike honda = new MotorBike();

		passionplus.start();
		honda.start();

//		passionplus.setSpeed(100);
		// I want to increase the speed by 100
//		int passionplusSpeed = passionplus.getSpeed();// get passionplusSpeed
//		passionplusSpeed += 100;// Increase it by 100
//		passionplus.setSpeed(passionplusSpeed);// set it to passionplus
//		System.out.println(passionplus.getSpeed());// getting speed
		honda.setSpeed(70);
		System.out.println(honda.getSpeed());
		honda.increaseSpeed(100);
		System.out.println(honda.getSpeed());
		honda.decreaseSpeed(200);
		System.out.println(honda.getSpeed());

	}

}

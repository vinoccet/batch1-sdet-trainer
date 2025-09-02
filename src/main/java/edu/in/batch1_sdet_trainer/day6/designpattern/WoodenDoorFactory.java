package edu.in.batch1_sdet_trainer.day6.designpattern;

public class WoodenDoorFactory implements DoorFactory{

	@Override
	public Door getDoorProvider() {
		return new WoodenDoor();
	}

}

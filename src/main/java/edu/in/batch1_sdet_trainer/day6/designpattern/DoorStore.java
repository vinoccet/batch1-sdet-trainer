package edu.in.batch1_sdet_trainer.day6.designpattern;

public class DoorStore {

	public static Door createDoors(String doorType) {
		switch (doorType) {
		case "WOODEN":
			return new WoodenDoor();
		case "PVC":
			return new PvcDoor();
		default:
			throw new RuntimeException("There is no door provider with type " + doorType);
		}
	}

}

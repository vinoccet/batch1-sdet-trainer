package edu.in.batch1_sdet_trainer.day6.designpattern;

public class DoorClient {

	public static void main(String[] args) {
		DoorFactory doorFactory = new WoodenDoorFactory();
		
		Door needDoor = doorFactory.getDoorProvider();
		needDoor.installDoors();
		
		
//		Door needDoor=DoorStore.createDoors("PVC");
//		needDoor.installDoors();
	}

}

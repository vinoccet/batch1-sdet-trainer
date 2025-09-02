package edu.in.batch1_sdet_trainer.day1;

public class CarTest {

	public static void main(String[] args) {
		Engine turBo=new Engine();
		turBo.setCapacity(1000);
		turBo.setCylinderType("Two cylinder");
		
		Engine turBoPlus=new Engine();
		turBo.setCapacity(2000);
		turBo.setCylinderType("four cylinder");
		
		Car car=new Car(20,"Ambassodor","white",false);
		car.drive();
		

		Car hondaI10=new Honda(20.10,"Honda I10","grey",true);
		hondaI10.setEngineType(turBoPlus);
		hondaI10.drive();

	}

}

package edu.in.batch1_sdet_trainer.day5;

public class MyTypeClass<T extends Animal> {
	private T value;

	public MyTypeClass(T value) {
		this.value = value;
	}

	public void print() {
		value.eat();
	}
}

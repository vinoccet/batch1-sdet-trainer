package edu.in.batch1_sdet_trainer.day6.designpattern;

public class TestCase {
	private String name;
	private String status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TestCase(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}
	@Override
	public String toString() {
		return "TestCase [name=" + name + ", status=" + status + "]";
	}

}

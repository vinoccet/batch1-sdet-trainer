package edu.in.batch1_sdet_trainer.day6.designpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableOrder {
	private final int orderId;
	private final String customerName;
	private final List<String> items;

	public ImmutableOrder(int order, String customerName, List<String> items) {
		this.orderId = order;
		this.customerName = customerName;
		this.items = Collections.unmodifiableList(new ArrayList<>(items));
	}
	
	public static void main(String[] args) {
		ImmutableOrder order=new ImmutableOrder(0, "vinoth", new ArrayList<String>(List.of("")));
        System.out.println(order);
	}
}

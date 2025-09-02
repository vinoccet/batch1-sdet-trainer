package edu.in.batch1_sdet_trainer.day6;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		Map<Integer, String> empMap = new HashMap<>();
		empMap.put(100, "Vinoth");
		empMap.put(100, "kumar"); // hashcode 100, index 0
		empMap.put(101, "kumar");// hashcode 101, index 1
		empMap.put(200, "nithin");// hashcode 200, index 0

		System.out.println(empMap.get(200));

		for (Map.Entry<Integer, String> mapEntries : empMap.entrySet()) {
			System.out.println(String.format("%d:%s", mapEntries.getKey(),mapEntries.getValue()));
		}

	}

}

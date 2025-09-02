package edu.in.batch1_sdet_trainer.day6.designpattern;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numbers = { 100, 5, 22, 11, 88, 77 };
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.toString(bubbleSort(numbers)));
		
		int a=2;
		String b="2";
		System.out.println(b.equals(a));
//		System.out.println(a==b);
	}

	static int[] bubbleSort(int[] numbers) {
		int length = numbers.length;
		int temp = 0;
		for (int i = 0; i < length-1; i++) {
			for (int j = i + 1; j < length  - i; j++) {
				if (numbers[j - 1] > numbers[j]) {
					temp = numbers[j - 1];
					numbers[j - 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		return numbers;
	}

	static int[] selectionSort(int[] numbers) {
		int length = numbers.length;
		int temp=0;
		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (numbers[j] < numbers[minIndex]) {
					minIndex = j;
				}
			}
			
			temp = numbers[i];
			numbers[i] = numbers[minIndex];
			numbers[minIndex] = temp;
		}
		return numbers;
	}
}

package edu.in.batch1_sdet_trainer.day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExeceptionTest {

	public static void main(String[] args)  {
		// Runtime exceptions
		// Nullpointer
		// Arrayoutofbound
		// Parse
		// Arthematic
		// NumberFormatException
		
		// checked exception
		// IO Exeception
		// sql exception
		// 

		String name = "vinoth";
		String[] names = { "vinoth","kumar" };

		try {

			System.out.println(name.toLowerCase());
			System.out.println(names[1]);
			System.out.println(Integer.parseInt("1"));
			
			//close();
		

		//close();
		System.out.println("after exception");
		
		FileReader reader;
		
			reader = new FileReader("");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("we are in finally");
			//close()
//			reader.close();
		}

//
	}

}

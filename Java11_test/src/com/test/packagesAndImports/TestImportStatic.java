package com.test.packagesAndImports;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class TestImportStatic {
	public static void main(String[] args) {
		int radius = 2;
		
		//We can use a static class variable on the Math class to 
		// get the value of PI
		double circumference = 2 * PI * radius;
		System.out.println("circumference = " + circumference);
		
		// We can use a static class method on the Math class to 
		// get the square root of a number
		double sqrt81 = sqrt(81);
		System.out.println("sqrt81 = "+ sqrt81);
		
	}

}

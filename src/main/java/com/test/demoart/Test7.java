package com.test.demoart;

import java.util.Random;

public class Test7 {
	   public static void main(String[] args) {
		      int counter;
		      Random rnum = new Random();
		      /* Below code would generate 5 random numbers
		       * between 0 and 200.
		       */
		      System.out.println("Random Numbers:");
		      System.out.println("***************");
		      for (counter = 1; counter <= 5; counter++) {
		         System.out.println(rnum.nextInt(200));
		      }
		   }
}

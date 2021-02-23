package com.callor.applicatios;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		
		int intSum = 0;
		for(int i = 0 ; i < intNums.length; i++) {
			
			boolean bYes1 = intNums[i] % 3 == 0;
			boolean bYes2 = intNums[i] % 5 == 0;
			
			if(bYes1 && bYes2) {
				intSum += intNums[i];
				
				System.out.println(intNums[i]);
			}
			
		}
		System.out.println(intSum);
	}
}

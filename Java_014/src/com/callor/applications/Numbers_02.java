package com.callor.applications;

public class Numbers_02 {

	public static void main(String[] args) {
		
		int intNum1 = 33;
		int intNum2 = 77;
		
		intNum1 = intNum1 + intNum2;
		intNum2 = intNum1 - intNum2;
		intNum1 = intNum1 - intNum2;
		
		System.out.println("intNum1 = " + intNum1);
		System.out.println("intNum2 = " + intNum2);
	}
}

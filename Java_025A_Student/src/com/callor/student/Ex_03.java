package com.callor.student;

public class Ex_03 {

	public static void main(String args[]) {
		
		int intSum = 0;
		for(int i = 0; i < 100; i++) {
			int num1 = i + 1;
			intSum += num1;
		}
		System.out.println("1~100까지 덧셈한 결과 : " + intSum);
	}
}

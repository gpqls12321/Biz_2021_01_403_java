package com.callor.start;

// 내가 한 것 

public class Odd_Even_01_1 {

	public static void main(String args[]) {

		int num = 0;
		int num1 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				num += i; // num = num + i;
			}

		}

		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				num1 += i;
			}
			
			
		}
		System.out.println("짝수의 합 : " + num);
		System.out.println("홀수의 합 : " + num1);
	}

}

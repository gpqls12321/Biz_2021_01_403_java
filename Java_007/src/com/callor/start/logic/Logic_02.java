package com.callor.start.logic;

public class Logic_02 {
	
	public static void main(String args[]) {
		
		// 논리연산결과를 담는 변수 (불값)
		// boolean, Boolean
		// 3과 3이 같냐고 물어보고 그 결과 값을 bYes 변수에 저장하라
		boolean bYes = 3 == 3; // bYes => true
		bYes = 3 > 3; // bYes => false
		System.out.println(bYes);
		
		bYes = 3 >= 3;
		
		int num1 = 55;
		int num2 = 65;
		
		bYes = num1 >= num2;
		
		bYes = num1 * 2 >= num2;
		bYes = (num1 * 2) >= num2;
	}

}

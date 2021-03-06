package com.callor.start.logic;

/*
 * 논리(Logic) 연산
 * 참(yes, true). 거짓(no, false)를 판단하여 어떤행위를 수행하는 연산
 * 
 */
public class Logic_01 {
	
	public static void main(String[] args) {
		
		// 3이 3 미만이냐
		// 3이 3 초과냐
		System.out.println(3 < 3);
		System.out.println(3 > 3);
		
		// ' == ' -> 논리 연산, 3이 3이냐
		System.out.println(3 == 3);
		
		//3이 3보다 작거나 같냐(이하)
		System.out.println(3 <= 3);
		
		//3이 3보다 크거나 같냐(이상)
		System.out.println(3 >= 3);
		
	}

}

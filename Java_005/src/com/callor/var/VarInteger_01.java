package com.callor.var;

public class VarInteger_01 {
	
	public static void main(String args[]) {
		
		
		//키워드와 관계없이 변수 이름은 중복 선언 불가!!!
		//0. 정수형변수 intNum1을 선언하고 정수형 값 30을 저장하라
		int intNum1 = 30;
		Integer intNum2 = 40;
		//int intNum2 = 50;
		
		
		
		/*
		 * 변수의 사용법
		 * 1. 읽기  
		 *   변수에 저장된 값은 아무리 많이 읽어도 저장된 값이 변하지 않는다
		 *
		 * 2. 변수에 값 저장하기
		 *   변수명 (=) 값
		 *    = 오른쪽의 값을 왼쪽의 변수명에 저장하라
		 */
		
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		// = 변수 intNum1에 저장된 값을 읽어서 console에 보여라
		
		//2. 변수에 값 저장하기 
		// 변수intNum1에 정수형 값 50을 저장하라
		intNum1 = 20;
	    intNum1 = 50;
	    // 50 = intNum1;  -> 잘못된 코드

	    intNum2 = 20;
		

	}

}

package com.callor.varriable;

public class Varriable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 응용 *
		 * 1. 정수형 변수 num1, num2를 선언
		 * 2. 두 변수에 30과 40을 각각 저장
		 * 3. 두 변수에 저장된 값을 사칙 연산과 Mod(나머지) 연산을 수행한 후 결과를
		 *    정수형 변수 result1, result2, result3, result4, result5에 각각 저장
		 * 4. result* 변수에 저장된 값을 Console에 출력
		 */
		
		//연산하고자 하는 원래 값이 저장되는 변수
		int num1 = 0;
		int num2 = 0;
		
		// 변수에 연산할 값을 저장하기
		num1 = 30;
		num2 = 40;

		//연산 결과를 저장할 변수 선언과 초기화
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		
		//연산결과를 변수에 저장하기
		result1 = num1 + num2;
		result2 = num1 * num2;
		result3 = num2 / num1;
		result4 = num2 - num1;
		result5 = num2 % num1;
		
		//변수에 저장된 결과를 Console에 출력
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	

	}

}

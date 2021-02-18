package com.callor.applications.service;

//내가 한 것
public class ClassServiceV1 {
	
	//중복선언 = 다형성
		// Java 코딩을 할 때 같은 이름의 변수는 두번 이상 선언 불가
		// class {}내에서 같은 이름의 메서드는 두번 이상 선언 불가
		// 하지만 java에서는 메서드의 매개변수 갯수, type이 다르면 같은 이름의 메서드 중복 선언 가능
	
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void add(int num1, float num2) {
		System.out.println(num1 + num2);
	}
	
	public void add(double num1, float num2) {
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 / num1);
		System.out.println(num2 - num1);
	}

}

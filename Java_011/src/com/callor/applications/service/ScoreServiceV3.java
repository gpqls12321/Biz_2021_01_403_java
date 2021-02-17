package com.callor.applications.service;

public class ScoreServiceV3 {
	
	public void sum(int num1, int num2) { //정수형 매개변수 2개를 전달받고 호출할 수 있는 method 
		System.out.println("정수 숫자 2개");
		System.out.println(num1 + num2);
	}
	
	public void sum() { //매개 변수가 하나도 없이 호출할 수 있는 method
		System.out.println("매개 변수 없음");
	}

	public void sum(float f1, float f2) { //float형 매개변수 2개를 전달하면서 호출할 수 있는 method
		System.out.println("실수 숫자 2개");
		System.out.println(f1 +f2);
	}
	// => 첫번째와 세번째 type이 다름

	public void sum(double d, float fnum1) { //매개변수 두개를 전달하면서 호출할 수 있는 method. 단, 두개의 매개변수는 double형, float형 순서대로 전달되어야 한다.
   	  							   			// sum(100F, 100D) => 순서 바뀌어서 오류!! 앞이 double, 뒤가 float가 되게 해야됨. 
		
	}
}

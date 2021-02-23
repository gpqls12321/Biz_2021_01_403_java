package com.callor.applicatios;

import java.util.Random;

public class Random_999 {

	public static void main(String[] args) {
		
		//Random 클래스 설명

		Random rnd = new Random(); // 랜덤 클래스를 사용하여 rnd 객체를 선언하고 =new Random() 명령을 사용하여 rnd 객체를 인스턴스화 시킨다.
		// rnd : Random 클래스의 인스턴스

		// rnd 인스턴스의 nextInt) method를 호출하라
		// 매개변수 값으로 100을 전달하라
		// Random 클래스의 nextInt) method 에 정수 100을 전달하고 실행하여 return 하는 결과를 num 변수에 저장하라
		// num 변수에는 0~99까지 중 1개의 숫자가 저장될 것이다.
		int num = rnd.nextInt();

		// num 변수에는 1~100까지 중 1개의 숫자가 저장될 것이다.
		num = rnd.nextInt(100) + 1;
	}
}

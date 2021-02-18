package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV3 {
	
	// 인스턴스 변수를 private으로 제한한다. 
	// 문법적 오류는 없지만..
	private int intNum1 = 0;
	private int intNum2 = 0;
	private Scanner scan = new Scanner(System.in);
	
	// scope() method 에서는 1개의 숫자를 키보드에서 입력받아
	// 변수 intNum1에 저장한다
	// 하지만 여기에서 선언된 intNum1은 클래스영역에 선언된 인스턴스변수와는 이름만 같을 뿐 완전히 다른 변수다.
	// 따라서 scope() method가 종료된 이후에는 변수값에 접근할수 없다.
	// scope() method에서 선언된 intNum1변수를 지역변수라고 한다.
	public void scope() {
		System.out.print("숫자입력 >> ");
		int intNum1 = scan.nextInt();
	}
	public void input() {
		System.out.print("숫자입력 >> ");
		intNum1 = scan.nextInt();
		System.out.print("숫자입력 >> ");
		intNum2 = scan.nextInt();
	}
	
	public void algebra() {
		System.out.print(intNum1);
		System.out.print("+");
		System.out.print(intNum2);
		System.out.print("=");
		System.out.println(intNum1 + intNum2);
		
		System.out.print(intNum1);
		System.out.print("x");
		System.out.print(intNum2);
		System.out.print("=");
		System.out.println(intNum1 * intNum2);
		
		System.out.print(intNum1);
		System.out.print("-");
		System.out.print(intNum2);
		System.out.print("=");
		System.out.println(intNum1 - intNum2);
		
		System.out.print(intNum1);
		System.out.print("/");
		System.out.print(intNum2);
		System.out.print("=");
		System.out.println(intNum1 / intNum2);
		
		/*
		 * print formatting 명령문
		 * ""안에 문자열을 작성하여 출력문을 만드는 명령문
		 * %d(Decimal) 위치에 정수값을 대신 부착하여 출력문 생성
		 */
		System.out.printf("%d x %d = %d \n" , intNum1, intNum2, intNum1 * intNum2);
		System.out.printf("%d / %d = %d \n" , intNum1, intNum2, intNum1 / intNum2);
		System.out.printf("%d - %d = %d \n" , intNum1, intNum2, intNum1 - intNum2);
		System.out.printf("%d + %d = %d \n" , intNum1, intNum2, intNum1 + intNum2);
	}

}

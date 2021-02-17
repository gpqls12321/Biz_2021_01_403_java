package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceExtendsV1 extends ScoreServiceV4{
	/*
	 * 클래스의 extends(확장, 상속)
	 * 
	 * ScoreServiceV4 : Parent(부모) 클래스
	 * ScoreServiceExtendsV1 : child(자식) 클래스
	 * 
	 * 단순한 extends 
	 * 		부모 클래스에 정의된 모든 method를 코드 한줄 추가, 수정 없이 그대로 사용할 수 있다.
	 * 
	 * 추가 extends
	 * 		부모 클래스에 정의된 method와 새롭게 추가된 method가 있는 확장된 클래스의 생성
	 */
	
//	public void input() {
//		System.out.println("여기는 ExtendsV1의 input()");
//	}
	
	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */
	public int input(String subject) {
		// input () 괄호 안에 과목명 입력하고 0~ 100까지 점수 입력(?)
		
		Scanner scan = new Scanner(System.in); // Scanner 클래스를 사용하여 Console에 값 입력할 수 있게 해주는 코드, 키보드로부터 무언가를 입력받기 위한 코드
		
		int intScore = 0;	// 정수형변수 intScore를 선언하고 '0' 저장
		while(true) {	
			System.out.print(subject + "점수 입력 >> "); // " 점수 입력 >> " 을 Console에 출력하라
			intScore = scan.nextInt(); // Console에 어떤 값 입력
			
			if(intScore < 0) { // 만약 입력한 값이 0보다 작으면
				System.out.println(subject + "점수는 0점 이상 입력하세요"); // " 점수는 0점 이상 입력하세요 "를 Console에 출력하라
			} else if ( intScore > 100) { // 그렇지 않고 입력한 값이 100보다 크면
				System.out.println(subject + "점수는 100점 이하 입력하세요"); // " 점수는 100점 이하 입력하세요 "를 Console에 출력
			} else { //그렇지 않으면 
				break; //while 반복문 멈춤
			}
			// 0초과 100미만의 정수를 입력하면 중단, 그렇지 않으면 경고문 보여주고 계속 반복 
		}
		
		// System.out.println("입력한 점수 : "+ intScore); // " 입력한 점수 : '입력한 값' "이 Console에 출력된다
		return intScore;
		
		//호출한 코드에서
		//return 30; -> int intKor에 30을 담아라
		//return 100; -> int intKor에 100을 담아라
	}

}

package com.callor.var;

public class Varriable {
	public static void main(String args[]) {
		
		/*
		 * 숫자의 체계
		 * 프로그래밍에서 숫자는 
		 * 정수와 실수가 있다
		 * 정수는 0과 십진수, 양수, 음수가 있다
		 *     정수는 부동소수점수 라고 표현하기도 한다
		 * 실수는 소수점 이하 값을 표현한다
		 * 실수는 소수점 이하 6자리, 16자리 표현방법이 있다
		 * 단정도 실수 : 소수점이하 6자리(java)
		 * 대정도 실수 : 소수점이하 16자리
		 * 
		 * 사칙연산 수행 시
		 * 정수와 정수의 연산은 결과도 정수
		 * 실수와 실수의 연산은 결과도 실수
		 * 실수와 정수의 연산은 정수가 실수로 바뀌어 실수 연산 수행, 실수로 표현
		 * 
		 * 정수와 실수가 달리 표현되는 것은
		 * 1. 기억장치에 저장하는 방법의 차이 때문
		 * 2. 연산 장치의 효과적인 사용 때문
		 */
		System.out.println(40 / 30);
		System.out.println(40.0 / 30.0);
		System.out.println(40.0 / 30);
		System.out.println(40 / 30.0);
		System.out.println(50.0 / 30.0);
	}

}

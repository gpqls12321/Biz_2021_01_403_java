package com.callor.hello;

/*
 * 클래스 이름 짓기 : 명명규칙
 * 1. 첫글자는 영문 대문자
 *    이후에는 영문대소문자, 숫자, UnderScore(_)
 * 2. 명명패턴
 *    Camel Case로 이름짓기
 *    HelloOperator -> 이런 식으로 대문자 소문자 대문자 소문자 : camel case 
 *    가급적 두 단어 이상으로 조합하여 짓자 
 *    각 단어가 시작될 때는 대문자로 시작
 *    숫자, UnderScore는 가급적 사용 자제
 *    클래스 이름만 보고 하는 일을 유추하도록 하자
 */

public class HelloOperator {
	public static void main(String args[]) {
		System.out.println(30 + 40);
		System.out.println(30 * 40);
		System.out.println(40 - 30);
		System.out.println(40 / 30);
		System.out.println(40 % 30);
		
		
	}

}

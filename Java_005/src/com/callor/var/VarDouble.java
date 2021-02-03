package com.callor.var;

/*
 * 실수, 배정도실수 표현
 * 
 * int : 2의 32승 범위의 숫자 표현
 * double : 2의 64승 범위의 숫자 표현
 *          소수점 자릿수 감안
 *          소수점 이하 16자리까지 표현
 *          
 * 컴퓨터에서 큰수를 저장 (표현)하는 방법
 *   323.0000
 *   = 3.2300 x 10의 2승
 *   = 3.23E2
 */
public class VarDouble {
	
	public static void main(String[] args) {
		
		/*
		 * double형 num1을 선언하고 그 넘버에 실수 30.0을 저장하라
		 * double형 num2를 선언하고 그 넘버에 실수 40.0을 저장하라
		 */
		
		// double형에 그냥 정수 적어도 실수, 저장될 때는 50.0으로 저장.
		double num1 = 30.0;
		double num2 = 40.0;
		double num3 = 50;
	    double num4 = 50.1111111111111111111111111;
	    double num5 = 50.0000000000000000000000000;
	    double num6 = 50.2222222222222222222222222;
	    double num7 = 50.5555555555555555555555555;
	    
		System.out.println(num1 + num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		
	}

}

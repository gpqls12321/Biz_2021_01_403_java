package com.callor.varriable;

public class Loop_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		
		// num1 이 10보다 작냐고 묻는 것
		for( ; num1 < 10 ;) {
			
			num1 += 1;
			System.out.println(num1);
		}
		System.out.println("나는 for 이후의 코드");

		num1 = 0; //1~100까지 출력하고 싶을 때! 만약 0으로 clear 안하고 Run하면 11~100까지 출력됨
		for( ; num1 < 100 ;) {
			num1 += 1;
			System.out.println(num1);
		}
	}

}
//유한반복문
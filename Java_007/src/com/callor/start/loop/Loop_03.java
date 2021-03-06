package com.callor.start.loop;

public class Loop_03 {
	public static void main(String args[]) {
		
		// main() method (local) scope 변수
		int intSum = 0;
	
		for(int i = 0 ; i < 10 ; i++) {
			// main() method scope 변수인 
			// intSum은 for() 반복문 내에서
			// 자유롭게 읽기 저장이 가능
			intSum += 10;
			System.out.println(i + "," + intSum);
		}
		// for()반복문이 종료된 후
		// 여기에서 읽을 수 있는 변수는 "intSum" 
		// 변수 i는 이미 소멸 됨
		
		System.out.println("===========================");
		System.out.println("intSum = " + intSum);
		System.out.println("===========================");
		
		// 이미 선언되어 사용 중인 변수를 clear
		// clear 하는 이유는 이 변수를 또 다른데에 이용하기 위해
		intSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			
			int num1 = i + 1;
			intSum += num1;
		}
		System.out.println("1 ~ 10까지 덧셈 : " + intSum);
	}
}

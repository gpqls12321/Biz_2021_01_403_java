package com.callor.start;


//for() 반복 명령문, if()비교연산 명령문을 사용하여 문제풀이
  // - 1 ~ 100까지 범위 중 짝수들의 합
  // - 1 ~ 100까지 범위 중 홀수들의 합 
public class Odd_Even_01 {
	
	public static void main(String[] args) {
		
		int intSumEven = 0;
		//0~99
		for(int i = 0 ; i < 100 ; i++) {
			
			int num = i + 1;
			
			boolean bYes = num % 2 == 0;
			
			//만약 bYes true 이면
			if(bYes) {
				intSumEven += num;
				// 값을 변수에 계속 더하라
				

			}
			
		}
		//결과값을 출력하라
		System.out.println("짝수들의 합 : " + intSumEven);
		
		int intSumOdd = 0;
		
		for(int i = 0; i < 100; i++) {
			int num = i + 1;
			
			boolean bYes = num % 2 == 1;
			
			if (bYes) {
				intSumOdd += num;
			}
		}
		System.out.println("홀수들의 합 : " + intSumOdd);
		
		//위에서 선언하고 사용했던 변수를 "재사용" 할 때는 반드시 초기화(clear)를 해야한다.
		intSumOdd = 0;
		for(int i = 0 ; i < 100 ; i ++) {
			int num = i + 1;
			boolean bYes = num % 2 ==0;
			
			//bYes가 false냐고 물어보는 것 
			// if (bYes == false) {}
			if (!bYes) { // "bYes가 true가 아니면" 이라는 뜻 
				intSumOdd += num;
			}
		}
		System.out.println("홀수의 합 : " + intSumOdd);
	}

}

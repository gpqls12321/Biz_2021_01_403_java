package com.callor.start;

// for()반복 명령문, if() 비교연산 명령문을 사용하여 다음 문제를 풀이하시오
//  - 7~ 106까지 범위 수 중에서 3의 배수가 아닌 수들의 합을 구하시오

public class Multiple_02_1 {

	public static void main(String[] args) {
		
		// ~ 범위의 값을 덧셈(합산, 누적)용 변수선언
		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 > 0;
			if (bYes) {
				intSum += num;
			}
		}
		System.out.println("3의 배수가 아닌 수들의 합 : " + intSum);
		
		intSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			if ( !bYes ) {
				intSum += num;
			}
		}
		
		intSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 != 0; //3으로 나누었을 때 나머지가 0이 아니냐고 묻는 것
			if ( bYes ) {
				intSum += num;
			}
	}

}
}

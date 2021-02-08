package com.callor.start;

//내가 한 거
// for()반복 명령문, if() 비교연산 명령문을 사용하여 다음 문제를 풀이하시오
//  - 7~ 106까지 범위 수 중에서 3의 배수가 아닌 수들의 합을 구하시오

public class Multiple_02 {

	public static void main(String[] args) {

		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 > 0;
			if (bYes) {
				intSum += num;
			}
		}
		System.out.println("3의 배수가 아닌 수들의 합 : " + intSum);
	}

}

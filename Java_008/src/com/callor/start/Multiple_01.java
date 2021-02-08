package com.callor.start;

// for() 반복 명령문, if() 비교연산 명령문을 사용하여 다음 문제를 풀이 하시오
// - 7~106까지 범위 수 중에서 3의 배수들을 console에 보이고 그 합을 구하시오
public class Multiple_01 {

	public static void main(String[] args) {

		int int3M = 0;

		for (int i = 0; i < 100; i++) {
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			if (bYes) {

				int3M += num;
				System.out.println(num + "는 3의 배수");
			}

		}

		System.out.println("3의 배수의 합 : " + int3M);
	}

}

package com.callor.start;

// 1~100까지 범위 수 중에서 3의 배수이면서, 9의 배수인 수들의 합을 구하시오
public class Multiple_01 {

	public static void main(String args[]) {

		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			boolean bYes = (num % 3 == 0) && (num % 9 == 0);
			if (bYes) {
				intSum += num;
			}
		}
		System.out.println("3의 배수이면서 9의 배수인 수들의 합 : " + intSum);

		intSum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			boolean bYes3 = num % 3 == 0;
			boolean bYes9 = num % 9 == 0;
			// 3의 배수 이면서( and ) 9의 배수
			if (bYes3 && bYes9) {
				intSum += num;
				System.out.println(num + ": 3과 9의 배수");
			}
		}
		System.out.println("3과 9의 배수인 수들의 합 : " + intSum);
		System.out.println("=============================");

		intSum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			boolean bYes3 = num % 3 == 0;
			boolean bYes9 = num % 9 == 0;

			// if () 비교연산문을 중복 처리하는 방식
			if (bYes3) { // 3의 배수를 검사하고 맞으면
				// 연산을 수행한 후
				if (bYes9) { // 다시 9의 배수를 검사
					intSum += num;
					System.out.println(num);

				}
			}

		}
		System.out.println(intSum);
	}

}

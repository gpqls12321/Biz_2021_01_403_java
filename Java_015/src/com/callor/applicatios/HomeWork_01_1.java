package com.callor.applicatios;

import java.util.Random;

import com.callor.applicatios.service.PrimeServiceV2;

public class HomeWork_01_1 {

	public static void main(String[] args) {
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random ();
		
		// 이 두개의 변수는 for() 반복문에서 수행한 연산 
		// 덧셈, 개수세기를 수행한 후
		// 결과를 출력하는 곳에서 사용해야할 변수이다
		// 따라서 for() 반복문이 시작되기 전에 
		// 변수를 선언 및 초기화 해두어야 한다.
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		for(int i = 0 ; i < 100 ; i++ ) {
			
			// 0~9999까지의 난수를 생성하고
			// 생성된 난수에 +2 수행
			// 실제 생선된 수는 2~10001까지 중에 난수를 생성하여 rndNum에 저장
			int rndNum = rnd.nextInt(10000) + 2;
			
			// PSV2 클래스의 prime () method는
			// rndNum가 소수이면 그 수를 그대로 return
			// 아니면 -1을 return
			int result = psV2.prime(rndNum);
			if(result > 0) {
				System.out.print(rndNum + ", ");
				
				//intPrimeSum += rndNum;                 ==> 실무에서는 이렇게 코딩함.
				//intPrimeCount ++;
			}
			// 소수들의 합을 계산하기
			// intPrimeSum 변수에 값을 누적하여 합계 계산
			if(result > 0) {
				intPrimeSum += rndNum;
			}
			
			if(result > 0) {
				intPrimeCount ++;
			}
		} // end for
		System.out.println();
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);
	}
}

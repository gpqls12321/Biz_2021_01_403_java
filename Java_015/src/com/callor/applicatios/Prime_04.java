package com.callor.applicatios;

import java.util.Random;

/*
 * 배열 없이 단순하게 난수를 생성하고 소수인지 판별하여 출력하기
 * 중복(이중) 반복문
 */
public class Prime_04 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				//여기 코드는 i 반복횟수 * j 반복횟수 만큼 반복됨
				// i가 0일 때 j는 0~9까지 , i가 1일 때 j는 0~9까지 . . .
			}
		}
		
		
		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
		Random rnd = new Random();
		for(int i = 0 ; i < 10; i++) {
			int rndNum = rnd.nextInt(1000) + 2;
			
			// 생성된 난수rndNum 값이 소수인지 검사
			int index = 0;
			for(index = 2; index < rndNum ; index++) { // 위에 for문과 변수가 겹치면 안됨 (i, index 다르게)
				
				if(rndNum % index == 0) {
					break;
				}
			}
			if (index < rndNum) {
				System.out.println(rndNum + " : 소수 아님");
			} else {
				System.out.println(rndNum + " : 소수");
				intPrimeSum += rndNum;
				intPrimeCount ++;
			}
		} // for i end
		
		System.out.println("합계 : " + intPrimeSum);
		System.out.println("개수 : " + intPrimeCount);
	}
}

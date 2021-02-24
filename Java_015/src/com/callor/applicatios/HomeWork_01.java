package com.callor.applicatios;

import java.util.Random;

import com.callor.applicatios.service.PrimeServiceV2;

public class HomeWork_01 {
	
	/*
	 * 2 이상의 임의의 정수 100개를 만들고
	 * PrimeServiceV2의 prime() method 호출하여 
	 * 임의 정수 100개 중 소수인 수들의 리스트를 출력
	 * 소수인 수들의 합 
	 */

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		for (int i = 0 ; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10000) + 2;
		}
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		int sum = 0;
		
		for (int i = 0 ; i < intNums.length; i++) {
			int num = intNums[i];
		int result = psV2.prime(num);
		if(result > 0) {
			System.out.println("소수 : " + num);
			sum += result;
		}
		}
		
		System.out.println("소수의 합 : " + sum);
	}
}

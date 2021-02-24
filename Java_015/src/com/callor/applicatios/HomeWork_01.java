package com.callor.applicatios;

import java.util.Random;

import com.callor.applicatios.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		int sum = 0;
		
		for (int i = 0 ; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10000) + 2;
		}
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
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

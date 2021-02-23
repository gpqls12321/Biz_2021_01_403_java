package com.callor.applicatios;

import java.util.Random;

import com.callor.applicatios.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		int num = 0;
		
		for (int i = 0 ; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100000) + 2;
			
			num = intNums[i];
		}
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		
		int sesult = psV2.prime(num);
		if(sesult < 0) {
			System.out.println(num + "소수아님");
		} else {
			System.out.println(num + "소수");
		}
	}
}

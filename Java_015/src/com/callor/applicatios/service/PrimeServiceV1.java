package com.callor.applicatios.service;

import java.util.Scanner;

public class PrimeServiceV1 {


	public void prime(int keyNum) {
		int pos = 0;
		
		for (pos = 2; pos < keyNum; pos++) {
			if (keyNum % pos == 0) {
				break;
			}
		}
		if (pos < keyNum) {
			System.out.println(keyNum + " : 소수 아님");
		} else {
			System.out.println(keyNum + " : 소수");
		}

	}

}

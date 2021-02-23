package com.callor.applicatios;

import java.util.Scanner;

import com.callor.applicatios.service.PrimeServiceV2;

public class Prime_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		int result = psV2.prime(num);
		if (result < 0) {
			System.out.println(num + " : 소수 아님");
		} else {
			System.out.println(num + " : 소수");
		}
	}
}

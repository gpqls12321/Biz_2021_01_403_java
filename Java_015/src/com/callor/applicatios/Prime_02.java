package com.callor.applicatios;

import java.util.Scanner;

import com.callor.applicatios.service.PrimeServiceV1;

public class Prime_02 {
	
	public static void main(String[] args) {
		
		PrimeServiceV1 psV1 = new PrimeServiceV1();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력 >> ");
		int keyNum = scan.nextInt();
		psV1.prime(keyNum);
	}

}

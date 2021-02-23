package com.callor.applicatios;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {
		
		int prime = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("2 이상의 정수 입력 >> ");
		prime = scan.nextInt();
		
		for(int i = 2 ; i < prime ; i++) {
			boolean bYes1 = prime % i == 1;
			boolean bYes2 = prime % i == prime;
			if (bYes1 || bYes2) {
				System.out.println(prime + " : 소수");
				break;
			} 
		}
		System.out.println("================================="); //이 위로 내가 한 것
		
		int pos = 0;
		for(pos = 2; pos < prime ; pos ++) {
			if(prime % pos == 0) {
				break;
			}
		}
		System.out.println(pos);
		// for 반복문이 중간에 break 되면 항상 pos < prime 이 된다.
		if(pos < prime) {
			System.out.println(prime + " : 소수 아님");
			
			// for 반복문이 break 없이 모두 완료되었으면
		} else {
			System.out.println(prime + " 소수");
		}
	}
}

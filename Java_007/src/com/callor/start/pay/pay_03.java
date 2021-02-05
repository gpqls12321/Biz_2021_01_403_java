package com.callor.start.pay;


/*
 * 흔히 사용하는 코드는 아님
 * pay _ 02 . java 를 많이 사용
 */
public class pay_03 {

	public static void main(String[] args) {

		int pay = 4_789_800;
		int paper = 50_000;

		for (int i = 0 ; pay > 0; i++) {
			int count = pay / paper;
			pay -= (paper * count);
			System.out.println(paper + "원권 : " + count);

			if (i % 2 == 0) { // i 가 짝수면
				paper = paper / 5;
			}
			
			else { // 그렇지 않으면 
				paper = paper / 2;
			}

		}
	}

}
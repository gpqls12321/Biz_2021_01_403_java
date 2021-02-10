package com.callor.applications;

import java.util.Scanner;

public class App_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력(2~9) >> ");
		int dan = scan.nextInt();

		boolean bYes2 = dan >= 2;
		boolean bYes9 = dan <= 9;
		if (bYes2 && bYes9) {

			System.out.println("=======================");
			System.out.println("구구단 " + dan + "단");
			System.out.println("-----------------------");

			for (int i = 0; i < 8; i++) {
				int num1 = i + 2;
				System.out.println(dan + "x" + num1 + "=" + dan * num1);
			}
			System.out.println("=======================");
		} else {
			System.out.println("입력한 숫자 : " + dan);
			System.out.println("값은 2~9까지만 입력하세요");
		}

	}

}

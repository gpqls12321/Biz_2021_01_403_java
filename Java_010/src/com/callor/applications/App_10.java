package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_10 {
	
	public static void main(String[] args) {
		
		MyGuGuDan myDan = new MyGuGuDan();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자 (2~9) >> ");
			int num = scan.nextInt();
			
			if(num <2 || num > 10) {
				System.out.println("error");
				System.out.println("2~9까지만 입력하세요");
			} else {
				myDan.print(num);
			}
		}
	}

}

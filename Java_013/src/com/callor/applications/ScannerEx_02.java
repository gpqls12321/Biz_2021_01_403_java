package com.callor.applications;

import java.util.Scanner;

public class ScannerEx_02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("과목 >> ");
		String strSub = scan.nextLine();
		
		System.out.print("점수 >> ");
		int intScore = scan.nextInt();
		
		scan.nextLine();
		System.out.print("과목 >> ");
		String strSub1 = scan.nextLine();
		
		System.out.print("점수 >> ");
		int intScore1 = scan.nextInt();
		
		scan.nextLine();
		System.out.print("과목 >> ");
		String strSub2 = scan.nextLine();
		
		System.out.print("점수 >> ");
		int intScore2 = scan.nextInt();
		
		System.out.printf("%s : %d\n",strSub,intScore);
		System.out.printf("%s : %d\n",strSub1,intScore1);
		System.out.printf("%s : %d\n",strSub2,intScore2);
	}

}

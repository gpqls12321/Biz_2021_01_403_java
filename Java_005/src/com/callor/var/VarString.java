package com.callor.var;

/*
 * 문자열형 변수
 * String
 */
public class VarString {
	
	public static void main(String args[]) {
		
		/*
		 * 변수 사용하는 이유 : 효율적, 코드를 변경해야될 경우 최소한으로 변경해서 원하는 결과를 얻음
		 */
		String str1 = "Korea";
		String str2 = "대한민국";
		String str3 = " Of";
		String str4 = " Korea";
		String str5 = " 우리나라";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 + str3 + str4);
		System.out.println(str2 + str5);

	}

}

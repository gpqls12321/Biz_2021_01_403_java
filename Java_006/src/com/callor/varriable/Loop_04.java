package com.callor.varriable;

public class Loop_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intDan = 3;
		int num1 = 0;
		
		System.out.println("===================");
		System.out.println("구구단");
		System.out.println("-------------------");
		
		// num1 = 1;
		for(num1 = 1; num1 < 10 ;) {
			System.out.print(intDan);
			System.out.print(" x ");
			System.out.print(num1);
			System.out.print(" = ");
			System.out.println(intDan * num1);
			num1 += 1;
		}
		for(num1 =1; num1 <5;) {
			System.out.println(num1);
			num1 += 1;
		
		}
		
		System.out.println("================================");
		
		/*
		 * for() 명령문이 실행되는 순서
		 * 최초에 한번 (1) 실행해서 num1 을 1로 세팅
		 * (2) 실행해서 num < 10 물어보기 
		 * 결과가 '예' 이면 
		 *    (3) ~ (7) 순서대로 실행
		 * (8) 실행해서 num1을 1증가
		 * 
		 * 다시 (2)를 실행해서 num1 < 10 물어보기
		 * 
		 *  이렇게 반복
		 *  num1 < 10 이 '아니오'가 될 때까지 반복.
		 *  '아니오'가 되면 for()문 종료
		 */
		
		// '<' 물어보는 코드 num1이 10보다 작냐?
		//  (1)         (2)      (8) 
 		for(num1 = 1 ; num1 <10; num1 += 1) {
			System.out.print(intDan); // (3)
			System.out.print(" x "); // (4)
			System.out.print(num1); // (5)
			System.out.print(" = "); // (6)
			System.out.println(intDan * num1); // (7)
		}
	}

}

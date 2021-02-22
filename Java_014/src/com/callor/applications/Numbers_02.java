package com.callor.applications;

public class Numbers_02 {

	public static void main(String[] args) {
		
		int intNum1 = 33;
		int intNum2 = 77;
		
		intNum1 = intNum1 + intNum2;
		intNum2 = intNum1 - intNum2;
		intNum1 = intNum1 - intNum2;
		
		System.out.println("intNum1 = " + intNum1);
		System.out.println("intNum2 = " + intNum2);
		
		System.out.println("======================================");
		
		int Num1 = 33;
		int Num2 = 77;
		int Num3 = 0;
		
		Num3 = Num1;
		Num1 = Num2;
		Num2 = Num3;
		
		System.out.println("Num1 = " + Num1);
		System.out.println("Num2 = " + Num2);
		
		System.out.println("======================================");
		
		// 1. (임시)로 사용할 intTemp를 만들고
		// 2. num1 변수값을 복사해 둔다 (백업)
		int iNum1 = 33;
		int iNum2 = 77;
		int intTemp = iNum1;
		
		// 3. num1 변수에 num2의 값을 복사
		//    num1 == num2 상태가 됨
		iNum1 = iNum2;
		
		// 4. 임시로 백업해둔 num1의 값을
		// 		num1 == 33
		//  	temp == 33
		//   num2에 복사
		iNum2 = intTemp;
		
		// 5. num1과 num2의 값이 서로 바뀐다
		//  변수값의 swap 코드
		System.out.println("iNum1 = " + iNum1);
		System.out.println("iNum2 = " + iNum2);
	}
}

package com.callor.start.bool;

public class BoolAlge_02 {
	
	public static void main(String[] args) {
		
		boolean bYes1 = 3 > 3;
		boolean bYes2 = 3 == 3;
		
		// false && true == false
		boolean bYes3 = bYes1 && bYes2;
		
		// false || true == true
		boolean bYes4 = bYes1 || bYes2;
		
		int num1 = 100;
		int num2 = 200;
		boolean bYes5 = (num1 > 50) || (num2 += 20) > 0;
		// (num1 > 50)의 결과가 true 이므로 java는 효율적인 코드 실행을 위하여 || 이후의 코드를 무시한다.
		// System.out.println(num2); //여기서 num2 => 220이 아니라 200이 나오는 이유 : or 연산일 경우 둘 중에 하나만 true이면 무조건 true 
		// num1 > 50 true 니까 num2+=20 이 명령은 실행하지 않아서
		
		if(num1 > 50) {
			num2 += 20;
		}
		
		
		bYes5 = (num1 < 50) && (num2 += 20) < 300; // and는 두개 중 하나만 false면 무조건 false라서 뒤에 num2 += 20 은 계산 안함
		// num1 < 50이 false 이므로 && 이후의 코드는 무시된다.
		if ( num1 < 50) {
			num2 += 20;
		}
	}

}

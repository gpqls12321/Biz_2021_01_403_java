package com.callor.var;

// class 이름 대문자-소문자-대문자-소문자 (=Upper Camel Case)
// 가
public class Var_01 {
	
	// 1
	public static void main(String[] args) {
		
		
		// Top (위쪽) 부분에 선언된 변수는 
		// Down (아래쪽) 에서 또 선언해서는 안된다
		// 한번 선언된 변수이름으로 또 다시 선언할 수 없다
		int num1 = 30;
		//int num1 = 40;
		// num1이 선언 됐으면 중복 선언할 수 없다
		
		int num2 = 50;
		int num3 = 60;
		
		//변수 이름을 짓는 규칙
		// 1. 변수 이름의 첫글자는 '소문자' , 이후 숫자, 영문대소문자, _ 사용 가능
		// 2. 두개 이상의 단어를 조합하여 짓는 것을 권장
		// 3. 두번째부터 시작되는 단어의 첫글자는 대문자 (=lower camel case) 
		int korScore = 90;
		int engScore = 100;
		int mathScore = 95;
		
		// 두개 이상의 단어로 조합이 다소 불편할 때
		// 변수명 접두사로 변수의 형(type)을 붙인다
		// =헝가리언 표기법
		int intNum1 = 20;
		int intNum2 = 30;
		int intNum3 = 40;
		
		float floatNum1 = 20.0F;
		float fNum2 = 30.0F;
		
		double doNum1 = 20.0;
		double doNum2 = 30.0;
		
		String strName = "홍길동";
		String strNation = "대한민국";
		String strTel = "010-1111-1111";
		String strAddr = "서울특별시";
		
		/*
		 * 변수명 단어와 단어사이에 UnderScore(_)
		 * = snake case
		 * 
		 * 데이터베이스와 연동하는 프로젝트를 만들 때 주로 사용하는 명명법
		 */
		String str_name = "이몽룡";
		
		String st_name = "성춘향"; // student_name
		String st_num = "202101001"; // student_num
		
		String dept_name = "컴퓨터공학";
		
			
		
	}// 2 
	// 1~2의 구역을 
	// main() method의 local area 또는 local scope라고 하며 줄여서 그냥 local 이라고 한다

}// 나
// 가~나의 구역을 클래스 Var_01의 private 영역이라고 한다.
// 또는 그냥 Var_01 클래스의 local 영역 이라고 한다.

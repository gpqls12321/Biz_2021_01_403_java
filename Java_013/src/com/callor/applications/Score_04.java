package com.callor.applications;

public class Score_04 {

	public static void main(String[] args) {
		
		// 배열 선언하기
		// 변수 선언 키워드에 [] 표식을 부착한다
		// =new 키워드 [개수] 형식으로 개수를 선언한다.
		
		// strName 변수를 다섯개 선언하라 하는 것과 유사
		String[] strName = new String[5];
		// strName[0] 에서 [0]의 의미
		// -> strName 변수 그룹에서 0번째 위치
		// 	  strName[0] = "홍길동"; => strName 배열변수의 0번째 주소에 홍길동 문자열을 저장하라
		strName[0] = "홍길동";
		strName[1] = "유재석";
		strName[2] = "한혜빈";
		strName[3] = "박명수";
		strName[4] = "장우영";
		
		// intKor 변수를 다섯개 선언하라 하는 것과 유사
		int[] intKor = new int[5];
		intKor[0] = 90;
		intKor[1] = 98;
		intKor[2] = 95;
		intKor[3] = 94;
		intKor[4] = 96;
		
		System.out.printf("%s\t%d\n",strName[0],intKor[0]);
		System.out.printf("%s\t%d\n",strName[1],intKor[1]);
		System.out.printf("%s\t%d\n",strName[2],intKor[2]);
		System.out.printf("%s\t%d\n",strName[3],intKor[3]);
		System.out.printf("%s\t%d\n",strName[4],intKor[4]);
		
		System.out.println("==============================================");
		for(int index = 0 ; index < 5 ; index++) {
			System.out.printf("%s\t%d\n",strName[index],intKor[index]);
		}
		
		int[] intEng = new int[5];
		int[] intMath = new int[5];
		int[] intSum = new int[5];
		
	}
}

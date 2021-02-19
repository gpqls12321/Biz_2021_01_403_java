package com.callor.applications;

public class Score_03 {

	public static void main(String[] args) {
		
		// 5명 학생 이름 저장할 변수
		String strName_1 = "홍길동";
		String strName_2 = "김길동";
		String strName_3 = "이길동";
		String strName_4 = "박길동";
		String strName_5 = "정길동";
		
		//다섯명 학생의 국어 점수를 저장할 변수
		int kor_1 = 90;
		int kor_2 = 88;
		int kor_3 = 65;
		int kor_4 = 98;
		int kor_5 = 78;
		
		// 다섯명 학생의 영어 점수 저장할 변수
		int eng_1 = 78;
		int eng_2 = 72;
		int eng_3 = 85;
		int eng_4 = 98;
		int eng_5 = 45;
		
		System.out.printf("%s\t%d\t%d\n",strName_1,kor_1,eng_1);
		System.out.printf("%s\t%d\t%d\n",strName_2,kor_2,eng_2);
		System.out.printf("%s\t%d\t%d\n",strName_3,kor_3,eng_3);
		System.out.printf("%s\t%d\t%d\n",strName_4,kor_4,eng_4);
		System.out.printf("%s\t%d\t%d\n",strName_5,kor_5,eng_5);
	}
}

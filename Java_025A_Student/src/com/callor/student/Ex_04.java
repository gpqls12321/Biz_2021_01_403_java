package com.callor.student;

import com.callor.student.model.StudentVO;

public class Ex_04 {

	public static void main(String args[]) {
		
		// 배열 10개 선언
		StudentVO[] stdArray = new StudentVO[10];
		
		int index = 2;
		
		// 초기화 안시키면 문법적인 오류 없는데 exception 남
		stdArray[index] = new StudentVO(); // 초기화 시키는 방법 1
		for(int i = 0; i < stdArray.length; i++) { // 초기화 시키는 방법 2
			stdArray[i] = new StudentVO();
		}
		
		stdArray[index].setStName("홍길동");
		stdArray[index].setStNum("0001");
		
		System.out.println("이름 : " + stdArray[index].getStName());
		System.out.println("학번 : " + stdArray[index].getStNum());
	}
}

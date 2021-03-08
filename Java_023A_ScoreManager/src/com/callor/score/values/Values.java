package com.callor.score.values;

public class Values {

	public static final String dLine;
	public static final String sLine;
	
	// static final 변수 생성하기
	static { //static이라는 생성자 블럭에서 만듦
		dLine = String.format("%070d", 0).replace("0","="); //빈칸 50개를 만들고 0이라는 값을 넣고 나머지 빈칸도 0으로 채우라는 코드
															// 그리고 0을 =로 바꾸라는.
		
		sLine = String.format("%070d", 0).replace("0", "-");
	}
}

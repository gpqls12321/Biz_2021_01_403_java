package com.callor.student;

import java.util.ArrayList;
import java.util.List;

import com.callor.student.model.StudentVO;

public class Ex_09 {

	public static void main(String[] args) {
		
		
		// new~ 어쩌고로 초기화 안하면 nullpointerException 발생
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		for(int i = 0; i < 10; i++) {
			StudentVO stdVO = new StudentVO();
			stdVO.setStName("홍길동");
			stdVO.setStNum("0001");
			stdList.add(stdVO);
		}
	}
}

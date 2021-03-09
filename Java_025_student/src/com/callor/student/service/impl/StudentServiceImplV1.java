package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;
import com.callor.student.values.ValStuList;
import com.callor.student.values.Values;

public class StudentServiceImplV1 implements StudentService {

	// 내가 한 코딩인데... ㅋㅋ 망
	private List<StudentVO> stulist;
	private Scanner scan;

	public StudentServiceImplV1() {
		stulist = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}

	public void loadDataFromFile() {
		// TODO Auto-generated method stub
		String fileName = "src/com/callor/student/학생정보리스트.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}

				String[] stuDatas = reader.split(":");
				StudentVO stuVO = new StudentVO(stuDatas[ValStuList.STU_NUM], stuDatas[ValStuList.STU_NAME],
						stuDatas[ValStuList.STU_DEP], stuDatas[ValStuList.STU_GRADE], stuDatas[ValStuList.STU_GROUP],
						stuDatas[ValStuList.STU_ADDR], stuDatas[ValStuList.STU_HP]);
				stulist.add(stuVO);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "파일이 없음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 읽는 도중 문제 발생");
		}
	}

	public void stList() {
		// TODO Auto-generated method stub

	}

	public void printStList() {
		// TODO Auto-generated method stub
		
		
		while(true) {
		System.out.println(Values.dLine(70));
		System.out.println("찾는 학생 이름을 입력하세요 (종료하려면 QUIT 입력)");
		System.out.println(Values.sLine(70));
		System.out.print("이름 >> ");
		String studentName = scan.nextLine();
		if(studentName == null ) {
			System.out.println(studentName + "자료는 없습니다");
			System.out.println(Values.dLine(70));
			return;
		}else if (studentName.equals("QUIT")) {
			System.out.println("종료합니다");
			break;
		} 
		else {
			System.out.println(Values.dLine(70));
			for(StudentVO vo : stulist) {
				if (studentName == vo.getStName()) {
				System.out.println("학번 : " + vo.getStNum());
				System.out.println("이름 : " + vo.getStName());
				System.out.println("학과 : " + vo.getStDep());
				System.out.println("학년 : " + vo.getStGrade());
				System.out.println("반 : " + vo.getStGroup());
				System.out.println("주소 : " + vo.getStAddr());
				System.out.println("전화번호 : " + vo.getStHP());
			}
		}
		}
		System.out.println(Values.dLine(70));
		}
	}

}

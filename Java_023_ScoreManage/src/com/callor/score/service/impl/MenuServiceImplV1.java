package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.MenuService;
import com.callor.score.values.Values;

public class MenuServiceImplV1 implements MenuService {

	private Scanner scan;
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	public Integer selectMenu() {
		
		while(true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 고교 성적 처리 시스템");
			System.out.println(Values.sLine);
			System.out.println(Values.SCORE_INPUT + ". 학생성적 점수 생성");
			System.out.println(Values.SCORE_SAVE + ". 학생성적 점수 파일에 저장");
			System.out.println(Values.SCORE_CHECK + ". 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.dLine);
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			
			if (strMenu.equals("QUIT")) {
				return null;
			}
			
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.printf("메뉴는 QUIT, %d ~ %d 까지만 선택 가능", Values.MENU_START, Values.MENU_LAST);
				continue;
			}
			
			if(intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else {
				System.out.printf("업무는 %d ~ %d 중에 선택",Values.MENU_START, Values.MENU_LAST);
			}
			
		}
		
	}

}

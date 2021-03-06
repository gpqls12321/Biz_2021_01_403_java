package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.MenuService;
import com.callor.shop.values.Values;


/*
 * Impl 접미사 : 인터페이스를 implements하여 생성한 클래스다
 */
public class MenuServiceImplV1 implements MenuService{

	/*
	 * final 키워드 : 변수, 객체를 혹시나 어디선가 변경하는 행위를 못하도록 방지함.
	 * 				: 상수언이라고 한다
	 * 				: final로 선언된 변수나 객체는 읽기 전용임.
	 * 
	 * ex) 
	 * 값을 저장하려고 시도하면 오류 발생.
	 * final int num = 0;
	 * num = 100; ===>오류 발생
	 */
	private final Scanner scan; 
	
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	public Integer selectMenu() {
		
		while(true) {
		System.out.println(Values.dLine);
		System.out.println("빛나라 쇼핑몰 2021");
		System.out.println(Values.sLine);
		System.out.printf("%d. 장바구니 추가\n", Values.MENU_INPUT);
		System.out.printf("%d. 장바구니 전체 보기\n", Values.MENU_ALL_LIST);
		System.out.printf("%d. 구매자별 장바구니 보기\n",Values.MENU_USER_LIST);
		System.out.printf("%d. 장바구니 파일 저장\n",Values.MENU_SAVE_CART_LIST);
		System.out.println("QUIT. 업무 종료");
		System.out.println(Values.sLine);
		System.out.print("선택 >> ");
		String strMenu = scan.nextLine();
				if(strMenu.equals("QUIT")) {
					return null;
				}
				
				/*
				try {
					Integer intMenu = Integer.valueOf(strMenu);
					if(intMenu >= 1 && intMenu <= 3) {
						return intMenu;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				*/
				
				// 위 코드는 최적화된 코드가 아니라 주석 처리하고 아래 코드로.
				
				//반드시 int가 아닌 Integer 로 선언
				Integer intMenu = null;
				try {
					intMenu = Integer.valueOf(strMenu);
				} catch (Exception e) {
					System.out.printf("메뉴는 QUIT, %d ~ %d 까지만 가능\n",Values.MENU_START,Values.MENU_LAST);
					continue;
				}
				//if()문과 try문 분리 해주는 것이 최적화된 코드
				if (intMenu >= Values.MENU_START && intMenu <= Values.MENU_LAST) {
					return intMenu;
				} else {
					System.out.printf("업무는 %d ~ %d 중에 선택\n",Values.MENU_START,Values.MENU_LAST);
				}
		}
	}
	
	
}

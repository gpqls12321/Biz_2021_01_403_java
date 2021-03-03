package com.callor.cart.service.impl;

import java.util.Scanner;

import com.callor.cart.service.MenuService;

public class MenuServiceV1 implements MenuService{

	private Scanner scan; //이거 쓰고 컨트롤스페이스바 하면 아래 코드 나타남 public MenuServiceV1() {}
	public MenuServiceV1() {
		// 생성자 메서드에서 scanner 초기화
		scan = new Scanner(System.in);
	}
	
	public Integer selectMenu() {
		
		while(true) {
			System.out.println("=======================================");
			System.out.println("카트 메뉴");
			System.out.println("---------------------------------------");
			System.out.println("1. 카트 추가");
			System.out.println("2. 카트 삭제");
			System.out.println("3. 카트 리스트");
			System.out.println("Q. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			if(strMenu.equals("Q")) {
				break;
			}
			
			try {
				Integer intMenu = Integer.valueOf(strMenu);
				if(intMenu >= 1 && intMenu <= 3) {
					return intMenu;
				}else {
					System.out.println("메뉴는 1~3까지 선택");
				}
			} catch (Exception e) {
				System.out.println("메뉴 선택은 Q, 1~3까지 정수만 가능");
			}
			
		}
		
		return null;
	}

	
}

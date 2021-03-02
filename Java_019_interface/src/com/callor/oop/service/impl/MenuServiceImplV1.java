package com.callor.oop.service.impl;

import java.util.Scanner;

public class MenuServiceImplV1 {

	/*
	 * 인스턴스 객체변수 선언
	 * 생성자에서 객체변수 초기화하여 사용할 준비
	 */
	private Scanner scan;
	
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	/*
	 * 메뉴를 확인한 후
	 * 		사용자가 메뉴를 선택하면 
	 * 		menuItem에 적절한 값을 담고 
	 * 		return을 수행하도록 코드 구현했다.
	 * 
	 * QUIT 선택하면 menuItem = null
	 * 1~3 중에서 선택하면 menuItem = 선택한 숫자
	 * 
	 */
	public void selecetMenu() {
		
	while(true) {
			System.out.println("==========================================");
			System.out.println("Java Menu System V1");
			System.out.println("------------------------------------------");
			System.out.println("1.카트추가" + "\n" + "2.카트삭제" + "\n" + "3.카트리스트" + "\n" + "QUIT.끝내기");
			System.out.println("------------------------------------------");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			
			// 1. Q를 입력하면 끝내기
			if(strMenu.equals("QUIT")) {
				System.out.println("끝내기");
				return;
			} 
			
			
			// 2. Q가 아니면 숫자로 변경하여 메뉴 선택 처리
			try {
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu == 1) {
					System.out.println("1. 카트 추가");
				} else if (intMenu == 2) {
					System.out.println("2. 카트 삭제");
				} else if (intMenu == 3) {
					System.out.println("3. 카트 리스트");
				} else {
					System.out.println("메뉴는 1~3까지만 입력");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("메뉴는 Q,1,2,3 중에 선택");
			}
			
			
			
		}
		
	}
}

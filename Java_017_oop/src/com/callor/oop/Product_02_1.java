package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02_1 {

	public static void main(String[] args) {

		// VO 클래스를 배열로 선언하고
		// 사용(데이터 저장, 읽기) 하려면 선언된 객체 배열 요소를 모두 다시 초기화(생성)하는 과정이 필요하다.
		// 이 과정이 생략되면 이후 코드에서 NullpointerException이 발생한다
		ProductVO[] pVOs = new ProductVO[5];
		for (int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}

		System.out.println("============================================");
		System.out.println("나라 쇼핑몰 상품관리 V1");
		System.out.println("============================================");

		Scanner scan = new Scanner(System.in);

		String strN = 3 + ""; // "3"이라는 문자열로 저장됨 (숫자열을 문자열로 바꾸는 것) ""안에 빈칸이 들어가면 오류남 반드시 붙여서 써아됨
		int intN = Integer.valueOf(strN); // 문자열이 숫자열로 바뀜

		for (int i = 0; i < pVOs.length; i++) {
			// 연속된 값으로 상품코드 생성
			String pCode = (i + 1) + ""; // 아무것도 없는 문자열 : 숫자가 됨
			pVOs[i].strPCode = pCode;
			System.out.println(pCode + "번 상품정보 입력");
			System.out.print("상품 코드 입력>> ");
			pVOs[i].strPCode = scan.nextLine();
			
			System.out.print("상품명 입력 >> ");
			pVOs[i].strPName = scan.nextLine();

			System.out.print("품목명 입력 >> ");
			pVOs[i].strItem = scan.nextLine();

			System.out.print("거래처 입력 >> ");
			pVOs[i].strDName = scan.nextLine();

			System.out.print("매입 단가 입력 >> ");
			String iPrice = scan.nextLine();
			pVOs[i].iPrice = Integer.valueOf(iPrice);
			
			System.out.print("매출 단가 입력 >> ");
			String oPrice = scan.nextLine();
			pVOs[i].oPrice = Integer.valueOf(oPrice);

			pVOs[i].toString();

		}
	}

}

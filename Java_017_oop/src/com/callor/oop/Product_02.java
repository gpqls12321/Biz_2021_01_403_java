package com.callor.oop;

// 내가 한 건데 틀린 곳 있음 ~! Integer.valueOf 사용법 모르겠음
import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {
	
	public static void main(String[] args) {
		
		// VO 클래스를 배열로 선언하고 
		// 사용(데이터 저장, 읽기) 하려면 선언된 객체 배열 요소를 모두 다시 초기화(생성)하는 과정이 필요하다.
		// 이 과정이 생략되면 이후 코드에서 NullpointerException이 발생한다
		ProductVO[] pVOs = new ProductVO[5];
		for (int i = 0 ; i < pVOs.length ; i++) {
			pVOs[i] = new ProductVO();
		}
		
		
		System.out.println("============================================");
		System.out.println("나라 쇼핑몰 상품관리 V1");
		System.out.println("============================================");

		Scanner scan = new Scanner(System.in);
		
		int strPCode = 0;
		int strPName = 0;
		int strItem = 0;
		int strDName = 0;
		
		for (int i = 0 ; i < pVOs.length ; i++) {
		System.out.print("상품 코드 입력 >> ");
		pVOs[i].strPCode = scan.nextLine();
		strPCode = Integer.valueOf(strPCode);
		
		System.out.print("상품명 입력 >> ");
		pVOs[i].strPName = scan.nextLine();
		strPName = Integer.valueOf(strPName);
		
		System.out.print("품목명 입력 >> ");
		pVOs[i].strItem = scan.nextLine();
		strItem = Integer.valueOf(strItem);
		
		System.out.print("거래처 입력 >> ");
		pVOs[i].strDName = scan.nextLine();
		strDName = Integer.valueOf(strDName);
		
		System.out.print("매입 단가 입력 >> ");
		pVOs[i].iPrice = scan.nextInt();
		
		System.out.print("매출 단가 입력 >> ");
		pVOs[i].oPrice = scan.nextInt();
		
		pVOs[i].toString();

		
		}
	}

}

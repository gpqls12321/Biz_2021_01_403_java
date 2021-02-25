package com.callor.oop;

// 내가 한 건데 틀린 부분 있음 03_1 참고 ~!
import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ProductVO[] pVOs = new ProductVO[5];
		for (int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}
		
		System.out.println("=============================================");
		System.out.println("어쩌고 쇼핑몰 상품관리 V1");
		System.out.println("=============================================");
		
		for (int i = 0; i < pVOs.length; i++) {
			String pCode = (i + 1) + "";
			pVOs[i].strPCode = pCode;
			System.out.println(pCode + "번 상품정보 입력");
			System.out.print("상품 코드 입력 >> ");
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
			
			boolean bYes1 = pVOs[i].iPrice == 0;
			boolean bYes2 = pVOs[i].iPrice < 0;
			if(bYes1 || bYes2) {
				System.out.println("다시 입력하세요");
			} 

			System.out.print("매출 단가 입력 >> ");
			String oPrice = scan.nextLine();
			pVOs[i].oPrice = Integer.valueOf(oPrice);
			if(pVOs[i].oPrice == 0 || pVOs[i].oPrice < 0) {
				System.out.print("다시 입력하세요");
			}
			
			pVOs[i].toString();
			
		} 
		
		
	}

}

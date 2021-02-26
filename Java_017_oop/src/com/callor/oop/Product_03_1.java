package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03_1 {

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

			while (true) {
				System.out.print("매입 단가 입력 >> ");
				String strIPrice = scan.nextLine();
				int intIPrice = Integer.valueOf(strIPrice);
				boolean bYes1 = pVOs[i].iPrice == 0;
				boolean bYes2 = pVOs[i].iPrice < 0;
				if (bYes1 || bYes2) {
					System.out.println("1 이상 입력하세요");
				} else {
					//정상처리 되었으면 (단가가 0 이상 입력되었으면 )
					// vo에 값을 저장하고 다음단계로 진행
					// 현 시점의 while()은 중단하라
					pVOs[i].iPrice = Integer.valueOf(intIPrice);
					break;
				}

			}

			while (true) {
				System.out.print("매출 단가 입력 >> ");
				String strOPrice = scan.nextLine();
				int intOPrice = Integer.valueOf(strOPrice);
				if (pVOs[i].oPrice == 0 || pVOs[i].oPrice < 0) {
					System.out.print("1 이상 입력하세요");
				} else {
					pVOs[i].oPrice = intOPrice;
					break;
				}
			}
			pVOs[i].toString();

		}

	}

}

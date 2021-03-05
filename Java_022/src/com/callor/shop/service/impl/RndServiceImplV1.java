package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1 {
	// public RndServiceImplV1 {} ==> 감춰져있음
	// 생성자 메서드 라고 한다. 클래스 이름과 똑같음
	
	//내가한거

	public String numsFile = "src/com/callor/shop/files/nums2.txt";
	public int[] intNum = new int[100];

	public void makeNums() {
		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(1000) + 1;
		}

	}

	public void saveFileNums() {
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {

			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);

			int count = 0;
			for (int n : intNum) {
				printer.print(n + ":");

				count++;
				if (count % 5 == 0) {
					printer.println();
				}
			}
			
			printer.close();
			fileWriter.close();

			System.out.println("Mission Complete");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

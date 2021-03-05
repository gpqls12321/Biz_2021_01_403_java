package com.callor.shop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {

	//내가 한 것
	public static void main(String[] args) {
		
		String numFile = "src/com/callor/shop/nums.txt";
		Random rnd = new Random();

		int[] num = new int[100];
		
		FileWriter fw;
		PrintWriter pw;
		
		try {
			fw = new FileWriter(numFile);
			pw = new PrintWriter(numFile);
			
			for(int n : num) {
				n = rnd.nextInt(1000)+1;
				pw.printf("%d\n",n);
			}
			
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package com.callor.iolist;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IoList_01 {
	
	public static void main(String[] args) {
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		String fileName = null;
		try {
			fileReader = new FileReader("src/com/callor/iolist/매입매출데이터.txt");
			buffer = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

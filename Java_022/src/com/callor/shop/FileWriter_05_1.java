package com.callor.shop;

import com.callor.shop.service.impl.RndServiceImplV1_1;

public class FileWriter_05_1 {

	public static void main(String[] args) {
		
		RndServiceImplV1_1 rs = new RndServiceImplV1_1();
		rs.makeRnd();
		rs.saveFileRnd();
	}
}

package com.callor.shop.files;

import com.callor.shop.service.impl.RndServiceImplV2;

public class FileWriter_06 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/nums_rnd2.txt";
		
		RndServiceImplV2 rs = new RndServiceImplV2(fileName);
		rs.makeRnd();
		rs.saveFileRnd(fileName);
	}
}

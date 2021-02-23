package com.callor.applicatios.service;

public class PrimeServiceV2 {
	
	public int prime(int num){
		int pos = 0;
		for(pos = 2; pos < num; pos++) {
			if(num % pos == 0) {
				return -1;
			}
		}
		return num;
	}
	
	
	

}

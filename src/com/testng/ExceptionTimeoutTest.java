package com.testng;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	@Test(invocationTimeOut = 2, expectedExceptions = NumberFormatException.class)
	
	public void infiniteLoop() {
		int i = 1;
		while(i==1) {
		System.out.println(i);	
		}
	}

	
}

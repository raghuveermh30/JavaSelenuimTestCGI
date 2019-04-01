package com.testng;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
	}

	@Test(dependsOnMethods="loginTest")
	public void homeTest() {
		System.out.println("Home Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchPage() {
		System.out.println("Home Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void registration() {
		System.out.println("Home Test");
	}
	
}

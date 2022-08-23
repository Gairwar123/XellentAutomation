package testpackage;

import org.testng.annotations.Test;

public class TestNGGroups {

	@Test(groups="Smoke")
	public void test1() {
		System.out.println("In test1 method..");
	}
	
	@Test(groups= {"Regression", "Sanity"})
	public void test2() {
		System.out.println("In test2 method..");
	}
	
	@Test(groups="Smoke")
	public void test3() {
		System.out.println("In test3 method..");
	}
}

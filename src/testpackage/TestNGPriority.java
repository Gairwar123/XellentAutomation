package testpackage;

import org.testng.annotations.Test;

public class TestNGPriority {
    
	@Test(priority=2)
	public void test1() {
		System.out.println(" First Test method");
	}
	
	@Test
	public void test2() {
		System.out.println(" Second Test method");
	}
	@Test(priority=-1)
	public void test3() {
		System.out.println(" Third Test method");
	}@Test(priority=1)
	public void test4() {
		System.out.println(" Fourth Test method");
	}
}

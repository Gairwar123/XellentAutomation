package testpackage;

import org.testng.annotations.Test;

public class TestNgDependsOnMethod {

	@Test
	public void launchFb() {
		System.out.println("Launch facebook");
	}
	
	@Test(dependsOnMethods="launchFb")
	public void loginFb() {
		System.out.println("Login to Facebook");
	}
	
	@Test(dependsOnMethods="loginFb")
	public void sendFriendRequsest() {
		System.out.println("Send Request to Friends ");
	}
}

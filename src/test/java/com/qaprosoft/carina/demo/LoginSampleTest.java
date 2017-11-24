package com.qaprosoft.carina.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.demo.gui.drones4hire.*;
import com.qaprosoft.carina.core.demo.gui.drones4hire.pages.LoginPage;
import com.qaprosoft.carina.core.foundation.AbstractTest;

public class LoginSampleTest extends AbstractTest{

	@Test
	public void testLogin()
	{
		LoginPage homePage = new LoginPage(getDriver());
		homePage.open();
		homePage.login("utja90@gmail.com", "222222");
		Assert.assertEquals(getDriver().getCurrentUrl(), "https://stag.drones4hire.com/dashboard/client/1",
				"Wrong password");
	}
}

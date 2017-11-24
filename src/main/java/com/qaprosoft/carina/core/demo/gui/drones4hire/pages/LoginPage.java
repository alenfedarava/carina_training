package com.qaprosoft.carina.core.demo.gui.drones4hire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class LoginPage extends AbstractPage {

	@FindBy(name = "email")
	private ExtendedWebElement emailTextField;

	@FindBy(name = "password")
	private ExtendedWebElement passwordTextField;

	@FindBy(xpath = ".//button")
	private ExtendedWebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://stag.drones4hire.com/login");
	}

	public void login(String email, String password) {
		emailTextField.type(email);
		passwordTextField.type(password);
		loginButton.click();
	}
}

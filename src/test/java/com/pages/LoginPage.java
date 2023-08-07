package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	
	@FindBy(xpath="//input[@name='username_show']")
	private WebElement txtWelcomeName;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String name, String pass ) {
		sendKeys(getTxtUsername(), name);
		sendKeys(getTxtPassword(), pass);
		click(getBtnLogin());
	}
}

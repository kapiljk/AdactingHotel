package com.adactingpract;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.LoginPage;

public class LoginNegative extends BaseClass {
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void openURL(String br) {
		browser(br);
		enterURL("https://adactinhotelapp.com/");
		maximize();
		}
	@Parameters({"userNegative","passNegative"})
	@Test(priority=0)
	public void loginCr(String userNegative, String passNegative) {
		LoginPage p = new LoginPage();
		p.login(userNegative, passNegative);
	}
	@AfterClass
	public void tearOut() {
	close();
	}

	}


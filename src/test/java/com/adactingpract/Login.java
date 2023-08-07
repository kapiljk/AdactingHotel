package com.adactingpract;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;
import com.pages.LoginPage;

public class Login extends BaseClass {
WebDriver driver;
@BeforeClass
@Parameters("browser")
public void openURL(String br) {
	browser(br);
	enterURL("https://adactinhotelapp.com/");
	maximize();
	}
@Parameters({"username","password"})
@Test(priority=0)
public void loginCr(String username, String password) {
	LoginPage p = new LoginPage();
	p.login(username, password);
	
}
@AfterClass
public void tearOut() {
close();
}

}

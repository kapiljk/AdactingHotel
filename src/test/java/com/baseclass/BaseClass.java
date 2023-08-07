package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;

public static void browser(String browser) {
	switch (browser) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		break;
	}

}
	public void sendKeys(WebElement element, String text) {
	element.sendKeys(text);
	}
	public void click(WebElement element) {
	element.click(); 
	}
	public void selectByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

}
	public void enterURL(String url) {
		driver.get(url);

	}
	public void close() {
		driver.close();
	}
	public void maximize() {
	driver.manage().window().maximize();
	}
	

}

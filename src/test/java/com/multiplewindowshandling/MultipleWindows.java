package com.multiplewindowshandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows extends BaseClass{
WebDriver driver;
@BeforeClass
private void openURL() {
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
driver.manage().window().maximize();
}
@Test
private void windowsHandling() {
driver.findElement(By.xpath("//p[contains(text(),'new browser window.')]//following-sibling::button")).click();
String mainWindow = driver.getWindowHandle();
Set<String> windowHandles = driver.getWindowHandles();
Iterator<String> iterator = windowHandles.iterator();
while (iterator.hasNext()) {
	String childWindow = iterator.next();
	if (!mainWindow.equals(childWindow)) {
		driver.switchTo().window(childWindow);
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("kapil");
	}
}
String title = driver.getTitle();
System.out.println(title);
String mainTitle = driver.switchTo().window(mainWindow).getTitle();
System.out.println(mainTitle);
}
}

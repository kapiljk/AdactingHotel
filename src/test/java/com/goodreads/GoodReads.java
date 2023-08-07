package com.goodreads;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoodReads {
	WebDriver driver;
	@BeforeClass
	private void openURL() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.goodreads.com/");
	driver.manage().window().maximize();
	}
	@Test
	private void goodReads_test() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Sign in with email')]")).click();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maheshmothkuri039@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Apt@12345");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//div[contains(@class,'searchBox--currentlyReading')]//descendant::input")).sendKeys("bagavad gita",Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/div[1]/div[1]/form[1]/button[1]/span[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("div.content:nth-child(3) div.mainContentContainer:nth-child(5) div.mainContent div.mainContentFloat div.myBooksPage:nth-child(3) div.last.col div.js-dataTooltip:nth-child(6) table.table.stacked tr.bookalike.review td.field.actions:nth-child(26) div.value:nth-child(2) div.actionsWrapper.greyText.smallText a.actionLinkLite.smallText.deleteLink > img:nth-child(1)")).click();
	
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}
}

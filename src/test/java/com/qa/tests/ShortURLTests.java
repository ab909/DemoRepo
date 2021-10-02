package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShortURLTests {

	static WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test (priority=1)
	public void shortURLTest() {
		driver.get("https://www.shorturl.at/");
		driver.findElement(By.name("u")).sendKeys("https://www.youtube.com/watch?v=nJdHnRaNR2E");
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		String shortURL = driver.findElement(By.xpath("//input[@type= 'text']")).getText();
		System.out.println(shortURL);
	}

	@Test (priority=2)
	public void clickCounterTest() {
		driver.get("https://www.shorturl.at/");
		driver.findElement(By.xpath("//a[contains(text(), 'how many clicks it received')]")).click();
		driver.getTitle();
		driver.findElement(By.name("u")).sendKeys("shorturl.at/czBH5");
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		String clicks = driver.findElement(By.cssSelector(".squarebox")).getText();
		System.out.println(clicks);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}

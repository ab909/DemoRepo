package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CustomXpathConcept {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "C:/Users/abhib/Downloads/geckodriver-v0.32.0-win32/geckodriver.exe");

        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://amazon.ca");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("proraso");

        driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
     //   driver.findElement(By.xpath("//a[contains(text(), 'Beauty & Personal Care')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".nav-line-1-container")).click();
        driver.findElement(By.cssSelector(".a-spacing-none ya-card__heading--rich a-text-normal")).click();



    }
}
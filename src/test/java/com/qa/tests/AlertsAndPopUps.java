package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndPopUps {

    static WebDriver driver;


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:/Users/abhib/Downloads/chromedriver_win32 (12)/chromedriver.exe");

        driver = new ChromeDriver();


      //  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
          driver.get("https://amazon.ca");


        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();



    }
}

package com.Test.driverHelpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Prashanth Reddy\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

    }

    public void closeBrowser() {
        driver.quit();
    }
}

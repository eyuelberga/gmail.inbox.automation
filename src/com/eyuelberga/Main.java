package com.eyuelberga;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    
    private static final String USERNAME = "";
    private static final String PASSWORD = "";
    private static final String DRIVERPATH = "";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", DRIVERPATH);
        WebDriver driver;
        driver = new ChromeDriver();
        //Launch gmail
        driver.get("http://mail.google.com");
        // Enter username
        driver.findElement(By.name("identifier")).sendKeys(USERNAME, Keys.ENTER);
        //wait a little while
        Thread.sleep(1000);
        //enter password
        driver.findElement(By.name("password")).sendKeys(PASSWORD, Keys.ENTER);
        //wait a little while till we enter the image captcha manually
        Thread.sleep(20000);
        //enter password again
        driver.findElement(By.name("password")).sendKeys(PASSWORD, Keys.ENTER);
        //wait a little while
        Thread.sleep(5000);
        // get the inbox number
        String inboxNumber = driver.findElement(By.className("bsU")).getText();
        System.out.println("You have " + inboxNumber+" Unread messages");
        // Done! close the driver
        driver.quit();
}
}

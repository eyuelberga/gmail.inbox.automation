package com.eyuelberga;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static final String USERNAME = "";
    private static final String PASSWORD = "";
    private static final String DRIVERPATH = "";
    private static final Integer WAIT_TIME = 1000;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", DRIVERPATH);
        WebDriver driver;
        driver = new ChromeDriver();
        //Launch gmail
        driver.get("http://mail.google.com");
        // Enter username
        driver.findElement(By.name("identifier")).sendKeys(USERNAME, Keys.ENTER);
        //wait a little while
        Thread.sleep(WAIT_TIME);
        //enter password
        driver.findElement(By.name("password")).sendKeys(PASSWORD, Keys.ENTER);

        // we only need this code when google gets suspicious
       /** Thread.sleep(WAIT_TIME *10);
        //enter password again
        driver.findElement(By.name("password")).sendKeys(PASSWORD, Keys.ENTER);**/
        //wait a little while
        Thread.sleep(WAIT_TIME);
        // get the inbox number
        String inboxNumber = driver.findElement(By.className("bsU")).getText();
        System.out.println("You have " + inboxNumber+" Unread messages");
        // Done! close the driver
        driver.quit();
}
}

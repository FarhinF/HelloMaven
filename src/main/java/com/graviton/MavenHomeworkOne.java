package com.graviton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MavenHomeworkOne {

    public static void main(String [] args) throws InterruptedException {

        System.out.println("This is Maven homework practice 1.");

        System.setProperty("webdriver.gecko.driver","/Users/farhinf.f/Desktop/Driver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        Thread.sleep(10000);

        System.out.println("Google is a search engine.");
        driver.quit();

    }
}

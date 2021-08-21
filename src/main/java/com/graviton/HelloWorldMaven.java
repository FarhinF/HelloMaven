package com.graviton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldMaven {

    public static void main(String [] args ) throws InterruptedException {
        System.out.println("Hello Maven");

        System.setProperty("webdriver.gecko.driver","/Users/farhinf.f/Desktop/Driver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.apache.org/");

        Thread.sleep(10000);

        System.out.println("I am from Virginia...");

        driver.quit();

    }

}

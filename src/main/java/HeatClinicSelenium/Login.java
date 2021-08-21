package HeatClinicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    public static void main(String [] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver","/Users/farhinf.f/Desktop/Driver/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.broadleafcommerce.org/login");
        Thread.sleep(2000);


        //LOGIN

        //Formula: //tagName[@attribute=‘value’]

        //enter email
        WebElement myElementEmailTwo = driver.findElement(By.id("username"));
        myElementEmailTwo.sendKeys("ffardous96@gmail.com");
        Thread.sleep(2000);

        //enter password
        WebElement myElementPasswordTwo = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
        myElementPasswordTwo.sendKeys("heatclinic101");
        Thread.sleep(2000);

        //click remember me button
        WebElement myElementRememberMe = driver.findElement(By.xpath("//span[@class='checkbox-material']"));
        myElementRememberMe.click();
        Thread.sleep(2000);

        //click login button
        WebElement myElementLoginTwo = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]"));
        myElementLoginTwo.click();
        Thread.sleep(2000);


    }
}
